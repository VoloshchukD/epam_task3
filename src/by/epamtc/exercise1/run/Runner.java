package by.epamtc.exercise1.run;

import by.epamtc.exercise1.entity.Array;
import by.epamtc.exercise1.service.FindArrayElementAction;
import by.epamtc.exercise1.service.FindSpecialNumbersAction;
import by.epamtc.exercise1.service.SortArrayAction;
import by.epamtc.exercise1.util.FillArrayAction;

import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        int[] emptyArray = new int[12];
        Array customArray = new Array(FillArrayAction.fillWithRandom(emptyArray, -1000, 1000));

        System.out.println("sortings");
        System.out.println(new Array(SortArrayAction.bubbleSort(customArray)));
        System.out.println(new Array(SortArrayAction.selectSort(customArray)));
        System.out.println(new Array(SortArrayAction.insertSort(customArray)));

        System.out.println("one element search");
        Array sortedArray = new Array(SortArrayAction.insertSort(customArray));
        System.out.println(FindArrayElementAction.binarySearch(sortedArray, emptyArray[0]));
        System.out.println(FindArrayElementAction.findMinValue(customArray));
        System.out.println(FindArrayElementAction.findMaxValue(customArray));

        System.out.println("many elements search");
        System.out.println("prime numbers " + new Array(FindSpecialNumbersAction.findPrimeNumbers(customArray)));
        emptyArray = new int[18];
        int[] fibonacciArray = FillArrayAction.fillFromFile(emptyArray, "data.txt");
        System.out.println("fibonacci numbers " + new Array(FindSpecialNumbersAction.findFibonaccisNumbers(
                new Array(fibonacciArray))));
        emptyArray = new int[4];
        emptyArray = FillArrayAction.fillFromConsole(emptyArray);
        System.out.println("unique digits " + new Array(FindSpecialNumbersAction.findUniqueNumbers(
                new Array(emptyArray))));
    }

}
