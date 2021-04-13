package by.epamtc.exercise2.service;

import by.epamtc.exercise2.exception.NullArrayException;

public class RowSumSorting extends Sorting {

    @Override
    public int[] findSortingValues(int[][] array) throws NullArrayException {
        if (array == null) throw new NullArrayException("Array is not initialized");
        int[] sumValues = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumValues[i] += array[i][j];
            }
        }
        return sumValues;
    }

}
