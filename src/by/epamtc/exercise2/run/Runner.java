package by.epamtc.exercise2.run;

import by.epamtc.exercise2.service.JaggedArraySortAction;

public class Runner {
    public static void main(String[] args) {
        int[][] array = {{2, 1, 3}, {7}, {9, 3, 5, 8, 1, 2}, {22, 14, 15, 10}};

        int[][] result = JaggedArraySortAction.sortByRowSum(array);
        System.out.println(JaggedArraySortAction.arrayToString(result));
    }
}
