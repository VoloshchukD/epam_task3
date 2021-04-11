package by.epamtc.exercise2.service;

public abstract class AbstractArrayAction {

    public final void swap(int[] array, int j) {
        int t = array[j + 1];
        array[j + 1] = array[j];
        array[j] = t;
    }

    public final void swap(int[][] array, int j) {
        int[] t = array[j + 1];
        array[j + 1] = array[j];
        array[j] = t;
    }

    public final int[][] toReverseOrder(int[][] array) {
        int lastIndex = array.length - 1;
        for (int i = 0; i <= lastIndex - i; i++) {
            int[] t = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = t;
        }
        return array;
    }

}
