package by.epamtc.exercise2.service;

import by.epamtc.exercise2.exception.NullArrayException;

public class MinValueSorting extends Sorting {

    @Override
    public int[] findSortingValues(int[][] array) throws NullArrayException {
        if (array == null) throw new NullArrayException("Array is not initialized");
        int[] minValues = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < minValue) {
                    minValue = array[i][j];
                }
            }
            minValues[i] = minValue;
        }
        return minValues;
    }

}
