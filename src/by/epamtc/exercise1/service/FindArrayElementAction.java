package by.epamtc.exercise1.service;

import by.epamtc.exercise1.entity.Array;
import by.epamtc.exercise1.exception.NullArrayException;
import by.epamtc.exercise1.exception.NullValuesException;

public class FindArrayElementAction {

    public static int binarySearch(Array array, int value) throws NullArrayException, NullValuesException {
        if (array == null) throw new NullArrayException("Array entity is not initialized");
        if (array.getValues() == null) throw new NullValuesException("Array values are not initialized");
        int[] resultArray = array.getValues();
        int fromIndex = 0;
        int toIndex = resultArray.length;
        int middleIndex = 0;

        while (resultArray[middleIndex] != value) {
            middleIndex = (toIndex + fromIndex) / 2;
            if (resultArray[middleIndex] > value) {
                toIndex = middleIndex;
            } else if (resultArray[middleIndex] < value) {
                fromIndex = middleIndex;
            } else if (resultArray[middleIndex] == value) {
                break;
            }
        }

        return middleIndex;
    }

    public static int findMinValue(Array array) throws NullArrayException, NullValuesException {
        if (array == null) throw new NullArrayException("Array entity is not initialized");
        if (array.getValues() == null) throw new NullValuesException("Array values are not initialized");
        int[] resultArray = array.getValues();
        int minValue = resultArray[0];

        for (int i = 1; i < array.getValues().length; i++) {
            if (resultArray[i] < minValue) {
                minValue = resultArray[i];
            }
        }

        return minValue;
    }

    public static int findMaxValue(Array array) throws NullArrayException, NullValuesException {
        if (array == null) throw new NullArrayException("Array entity is not initialized");
        if (array.getValues() == null) throw new NullValuesException("Array values are not initialized");
        int[] resultArray = array.getValues();
        int maxValue = resultArray[0];

        for (int i = 1; i < array.getValues().length; i++) {
            if (resultArray[i] > maxValue) {
                maxValue = resultArray[i];
            }
        }

        return maxValue;
    }

}
