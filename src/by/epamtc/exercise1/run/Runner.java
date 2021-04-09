package by.epamtc.exercise1.run;

import by.epamtc.exercise1.entity.Array;
import by.epamtc.exercise1.service.SearchElementAction;
import by.epamtc.exercise1.service.SearchSpecialNumbersAction;
import by.epamtc.exercise1.service.SortArrayAction;
import by.epamtc.exercise1.util.FillArrayAction;

import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
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
        int[] fibonacciArray = {0, 1, 1, 2, 3, 5, 6, 7, 8, 9, 17, 23, 40, 41, 44, 45, 47, 92, 139};
        System.out.println(new Array(SearchSpecialNumbersAction.findFibonaccisNumbers(new Array(fibonacciArray))));

        int[] array1 = {123, 111, 2, 3232, 141, 45, 321};
        System.out.println(new Array(SearchSpecialNumbersAction.findUniqueNumbers(new Array(array1))));

        int[] emptyArray = new int[10];
        System.out.println(new Array(FillArrayAction.fillWithRandom(emptyArray)));
        System.out.println(new Array(FillArrayAction.fillFromFile(emptyArray, "data.txt")));
        System.out.println(new Array(FillArrayAction.fillFromConsole(emptyArray)));
    }

}
