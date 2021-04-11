package by.epamtc.exercise2.service;

public class MinValueSorting extends Sorting {

    @Override
    public int[] findSortValues(int[][] array) {
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
