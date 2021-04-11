package by.epamtc.exercise2.service;

public class RowSumSorting extends Sorting {

    @Override
    public int[] findSortValues(int[][] array) {
        int[] sumValues = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumValues[i] += array[i][j];
            }
        }
        return sumValues;
    }

}
