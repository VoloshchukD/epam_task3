package by.epamtc.exercise1.service;

import by.epamtc.exercise1.entity.Array;

public class SearchSpecialNumbersAction {

    public static int[] findPrimeNumbers(Array array) {
        int[] currentArray = array.getValues();

        int dividersCounter = 0;
        int primeNumbersCounter = 0;

        for (int i = 1; i < currentArray.length; i++) {
            dividersCounter = 0;
            for (int j = 2; j < currentArray[i] - 1; j++) {
                if (currentArray[i] % j == 0) {
                    dividersCounter++;
                }
            }
            if (dividersCounter == 0) {
                primeNumbersCounter++;
            } else {
                currentArray[i] = 4;
            }
        }

        int[] resultArray = new int[primeNumbersCounter];
        int resultArrayIndex = 0;
        for (int i = 1; i < currentArray.length; i++) {
            if (currentArray[i] != 4) {
                resultArray[resultArrayIndex] = currentArray[i];
                resultArrayIndex++;
            }
        }

        return resultArray;
    }

    public static int[] findFibonaccisNumbers(Array array) {
        int[] currentArray = array.getValues();
        int[] resultArray = new int[currentArray.length];

        int findFibonaccisNumbersCounter = 0;
        int firstNumber;
        int secondNumber;
        int lastAddedIndex1 = -1;
        int lastAddedIndex2 = -1;
        int i = 2;
        int k = 0;

        while (i < currentArray.length) {
            firstNumber = currentArray[i - 2];
            secondNumber = currentArray[i - 1];
            if (firstNumber + secondNumber == currentArray[i]) {
                if (lastAddedIndex1 != i - 2 && lastAddedIndex2 != i - 2) {
                    findFibonaccisNumbersCounter++;
                    resultArray[k] = firstNumber;
                    k++;
                }
                if (lastAddedIndex2 != i - 1) {
                    findFibonaccisNumbersCounter++;
                    resultArray[k] = secondNumber;
                    k++;
                }

                findFibonaccisNumbersCounter++;
                resultArray[k] = currentArray[i];
                k++;

                lastAddedIndex1 = i - 1;
                lastAddedIndex2 = i;
            }

            i++;
        }

        int[] formattedresultArray = new int[findFibonaccisNumbersCounter];
        for (int j = 0; j < findFibonaccisNumbersCounter; j++) {
            formattedresultArray[j] = resultArray[j];
        }

        return formattedresultArray;
    }

    public static int[] findUniqueNumbers(Array array) {
        int[] currentArray = array.getValues();

        int uniqueDigitsNumbersCounter = 0;
        for (int i = 0; i < currentArray.length; i++) {
            if ( (currentArray[i] >= 100) && (currentArray[i] < 1000) ) {
                int digitOne = currentArray[i] / 100;
                int digitTwo = (currentArray[i] / 10) % 10;
                int digitThree = currentArray[i] % 10;
                if (digitOne != digitTwo && digitOne != digitThree &&
                        digitTwo != digitThree) {
                    uniqueDigitsNumbersCounter++;
                } else {
                    currentArray[i] = 0;
                }
            } else {
                currentArray[i] = 0;
            }
        }

        int[] resultArray = formatArray(currentArray, uniqueDigitsNumbersCounter, 0);
        return resultArray;
    }

    public static int[] formatArray(int[] array, int newArrayLength, int deleteValue) {
        int[] resultArray = new int[newArrayLength];

        int resultArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != deleteValue) {
                resultArray[resultArrayIndex] = array[i];
                resultArrayIndex++;
            }
        }

        return resultArray;
    }

}
