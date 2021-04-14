package by.epamtc.exercise2.service;

import by.epamtc.exercise2.exception.NullArrayException;

public abstract class Sorting extends AbstractArrayAction {

    public abstract int[] findSortingValues(int[][] array) throws NullArrayException;

    public final void sort(int[][] array, boolean descending) throws NullArrayException {
        if (array == null) throw new NullArrayException("Array is not initialized");

        int[] sortingElements = findSortingValues(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (sortingElements[j] > sortingElements[j + 1]) {
                    swap(sortingElements, j);
                    swap(array, j);
                }
            }
        }

        if (descending) {
            array = toReverseOrder(array);
        }
    }

}
