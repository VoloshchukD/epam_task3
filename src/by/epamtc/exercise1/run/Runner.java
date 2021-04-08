package by.epamtc.exercise1.run;

import by.epamtc.exercise1.entity.Array;
import by.epamtc.exercise1.service.SearchElementAction;
import by.epamtc.exercise1.service.SearchSpecialNumbersAction;
import by.epamtc.exercise1.service.SortArrayAction;

public class Runner {
    public static void main(String[] args) {
        int[] array = {4, 10, 9, 2, 3, 7, 1, 5, 6, 8};
        Array newArray = new Array(array);

        System.out.println(new Array(SortArrayAction.bubbleSort(newArray)));
        System.out.println(new Array(SortArrayAction.selectSort(newArray)));
        System.out.println(new Array(SortArrayAction.insertSort(newArray)));

        Array sortedArray = new Array(SortArrayAction.insertSort(newArray));

        System.out.println(SearchElementAction.binarySearch(sortedArray, 9));
        System.out.println(SearchElementAction.findMinValue(newArray));
        System.out.println(SearchElementAction.findMaxValue(newArray));
        System.out.println(new Array(SearchSpecialNumbersAction.findPrimeNumbers(newArray)));
    }

}
