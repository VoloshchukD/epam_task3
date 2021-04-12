package by.epamtc.exercise1.service;

import by.epamtc.exercise1.entity.Array;
import by.epamtc.exercise1.exception.NullArrayException;
import by.epamtc.exercise1.exception.NullValuesException;

public class FindSpecialNumbersAction {

    public static int[] findPrimeNumbers(Array array) throws NullArrayException, NullValuesException {
        if (array == null) throw new NullArrayException("Array entity is not initialized");
        if (array.getValues() == null) throw new NullValuesException("Array values are not initialized");
        int[] currentArray = array.getValues();
        int[] resultArray = new int[currentArray.length];

        int primeNumbersCounter = 0;
        for (int i = 1; i < currentArray.length; i++) {
            int dividersCounter = 0;
            int absoluteValue = Math.abs(currentArray[i]);
            for (int j = 2; j < absoluteValue - 1; j++) {
                if (absoluteValue % j == 0) {
                    dividersCounter++;
                }
            }
            if (dividersCounter == 0) {
                resultArray[primeNumbersCounter] = currentArray[i];
                primeNumbersCounter++;
            }
        }

        resultArray = deleteEmptyReminder(resultArray, primeNumbersCounter);
        return resultArray;
    }

    public static int[] findFibonaccisNumbers(Array array) throws NullArrayException, NullValuesException {
        if (array == null) throw new NullArrayException("Array entity is not initialized");
        if (array.getValues() == null) throw new NullValuesException("Array values are not initialized");
        int[] currentArray = array.getValues();
        int[] resultArray = new int[currentArray.length];

        int findFibonaccisNumbersCounter = 0;
        int firstNumber;
        int secondNumber;
        int lastAddedIndex1 = -1;
        int lastAddedIndex2 = -1;
        int i = 2;

        while (i < currentArray.length) {
            firstNumber = currentArray[i - 2];
            secondNumber = currentArray[i - 1];
            if (firstNumber + secondNumber == currentArray[i]) {
                if (lastAddedIndex1 != i - 2 && lastAddedIndex2 != i - 2) {
                    resultArray[findFibonaccisNumbersCounter] = firstNumber;
                    findFibonaccisNumbersCounter++;
                }
                if (lastAddedIndex2 != i - 1) {
                    resultArray[findFibonaccisNumbersCounter] = secondNumber;
                    findFibonaccisNumbersCounter++;
                }

                resultArray[findFibonaccisNumbersCounter] = currentArray[i];
                findFibonaccisNumbersCounter++;

                lastAddedIndex1 = i - 1;
                lastAddedIndex2 = i;
            }

            i++;
        }

        resultArray = deleteEmptyReminder(resultArray, findFibonaccisNumbersCounter);
        return resultArray;
    }

    public static int[] findUniqueNumbers(Array array) {
        int[] currentArray = array.getValues();
        int[] resultArray = new int[currentArray.length];

        int uniqueDigitsNumbersCounter = 0;
        for (int i = 0; i < currentArray.length; i++) {
            if ((currentArray[i] >= 100) && (currentArray[i] < 1000)) {
                int digitOne = currentArray[i] / 100;
                int digitTwo = (currentArray[i] / 10) % 10;
                int digitThree = currentArray[i] % 10;
                if (digitOne != digitTwo && digitOne != digitThree &&
                        digitTwo != digitThree) {
                    resultArray[uniqueDigitsNumbersCounter] = currentArray[i];
                    uniqueDigitsNumbersCounter++;
                } else {
                    currentArray[i] = 0;
                }
            } else {
                currentArray[i] = 0;
            }
        }

        resultArray = deleteEmptyReminder(resultArray, uniqueDigitsNumbersCounter);
        return resultArray;
    }

    public static int[] deleteEmptyReminder(int[] array, int newLength) {
        int[] formattedResultArray = new int[newLength];
        for (int j = 0; j < newLength; j++) {
            formattedResultArray[j] = array[j];
        }
        return formattedResultArray;
    }

}
