package by.epamtc.exercise2.service;

public abstract class Sorting extends AbstractArrayAction {

    public abstract int[] findSortingValues(int[][] array);

    private final int[][] sort(int[][] array) {
        int[] sortingElements = findSortingValues(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (sortingElements[j] > sortingElements[j + 1]) {
                    swap(sortingElements, j);
                    swap(array, j);
                }
            }
        }
        return array;
    }

    public final int[][] sort(int[][] array, boolean descending) {
        int[][] sortedArray = sort(array);
        if (descending) {
            sortedArray = toReverseOrder(sortedArray);
        }
        return array;
    }

}
