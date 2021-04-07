package by.epamtc.exercise1.service;

import by.epamtc.exercise1.entity.Array;

public class SortArrayAction {

    public static int[] bubbleSort(Array array) {
        int[] resultArray = array.getValues();
        int t;
        for (int i = 0; i < array.getValues().length - 1; i++) {
            for (int j = 0; j < array.getValues().length - 1; j++) {
                if (resultArray[j] > resultArray[j + 1]) {
                    t = resultArray[j];
                    resultArray[j] = resultArray[j + 1];
                    resultArray[j + 1] = t;
                }
            }
        }
        return resultArray;
    }

    public static int[] selectSort(Array array) {
        int[] resultArray = array.getValues();
        int minValue = 0;
        int minValueIndex = 0;
        for (int i = 0; i < array.getValues().length; i++) {
            minValue = resultArray[i];
            minValueIndex = i;
            for (int j = i + 1; j < array.getValues().length; j++) {
                if (resultArray[j] < minValue) {
                    minValue = resultArray[j];
                    minValueIndex = j;
                }
            }
            resultArray[minValueIndex] = resultArray[i];
            resultArray[i] = minValue;
        }
        return resultArray;
    }

    public static int[] insertSort(Array array) {
        int[] resultArray = array.getValues();
        for (int i = 1; i < array.getValues().length; i++) {
            int j = i - 1;
            int currentValue = resultArray[i];
            for (; j >= 0; j--) {
                if (currentValue < resultArray[j]) {
                    resultArray[j + 1] = resultArray[j];
                } else {
                    break;
                }
            }
            resultArray[j + 1] = currentValue;
        }
        return resultArray;
    }

}
