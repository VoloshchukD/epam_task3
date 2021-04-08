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
