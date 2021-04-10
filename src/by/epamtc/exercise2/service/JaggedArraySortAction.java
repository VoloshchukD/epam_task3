package by.epamtc.exercise2.service;

public class JaggedArraySortAction {

    public static int[] sumRowValues(int[][] array) {
        int[] sumValues = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumValues[i] += array[i][j];
            }
        }
        return sumValues;
    }

    public static int[][] sortByRowSum(int[][] array) {
        int[] sumValues = sumRowValues(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (sumValues[j] > sumValues[j + 1]) {
                    int[] t = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
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
