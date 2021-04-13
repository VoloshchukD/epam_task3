package by.epamtc.exercise2.service;

import by.epamtc.exercise2.exception.NullArrayException;

public abstract class AbstractArrayAction {

    public final void swap(int[] array, int j) throws NullArrayException {
        if (array == null) throw new NullArrayException("Array is not initialized");
        int t = array[j + 1];
        array[j + 1] = array[j];
        array[j] = t;
    }

    public final void swap(int[][] array, int j) throws NullArrayException {
        if (array == null) throw new NullArrayException("Array is not initialized");
        int[] t = array[j + 1];
        array[j + 1] = array[j];
        array[j] = t;
    }

    public final int[][] toReverseOrder(int[][] array) throws NullArrayException {
        if (array == null) throw new NullArrayException("Array is not initialized");
        int lastIndex = array.length - 1;
        for (int i = 0; i <= lastIndex - i; i++) {
            int[] t = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = t;
        }
        return array;
    }

}
