package by.epamtc.exercise2.service;

public class MaxValueSorting extends Sorting {

    @Override
    public int[] findSortingValues(int[][] array) {
        int[] maxValues = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int maxValue = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
            maxValues[i] = maxValue;
        }
        return maxValues;
    }

}
