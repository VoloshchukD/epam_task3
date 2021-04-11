package by.epamtc.exercise2.run;

import by.epamtc.exercise2.service.MaxValueSorting;
import by.epamtc.exercise2.service.MinValueSorting;
import by.epamtc.exercise2.service.Sorting;
import by.epamtc.exercise2.service.RowSumSorting;

public class Runner {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 6}, {7, 99}, {-1, 9, 4, 3, 5, 8, 15}, {0, 15, 14, 22}};

        RowSumSorting rowSumSort = new RowSumSorting();
        testSorting(rowSumSort, array);

        MinValueSorting minValueSort = new MinValueSorting();
        testSorting(minValueSort, array);

        MaxValueSorting maxValueSort = new MaxValueSorting();
        testSorting(maxValueSort, array);
    }

    public static void testSorting(Sorting sorting, int[][] array) {
        int[][] result = sorting.sort(array, false);
        System.out.println(sorting.getClass().getName());
        System.out.println("ascending\n" + arrayToString(result) + "\n");
        result = sorting.sort(array, true);
        System.out.println("descending\n" + arrayToString(result) + "\n");
    }

    public static String arrayToString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                stringBuilder.append(array[i][j]);
                stringBuilder.append("  ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
