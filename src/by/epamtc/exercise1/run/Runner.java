package by.epamtc.exercise1.run;

import by.epamtc.exercise1.entity.Array;
import by.epamtc.exercise1.exception.InvalidRangeException;
import by.epamtc.exercise1.exception.NoSuchParameterException;
import by.epamtc.exercise1.exception.NullValuesException;
import by.epamtc.exercise1.exception.WrongFileNameException;
import by.epamtc.exercise1.service.FindSpecialNumbersAction;
import by.epamtc.exercise1.dao.FillArrayAction;

import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException, NoSuchParameterException,
            NullValuesException, WrongFileNameException, InvalidRangeException {
        int[] emptyArray = new int[12];
        Array customArray = new Array(FillArrayAction.fillWithRandom(emptyArray, -1000, 1000));

        System.out.println("sortings");
        customArray.bubbleSort();
        System.out.println(customArray);
        customArray.selectSort();
        System.out.println(customArray);
        customArray.insertSort();
        System.out.println(customArray);

        System.out.println("one element search");
        Array sortedArray = customArray;
        System.out.println(sortedArray.binarySearch(emptyArray[0]));
        System.out.println(sortedArray.findMinValue());
        System.out.println(sortedArray.findMaxValue());

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
