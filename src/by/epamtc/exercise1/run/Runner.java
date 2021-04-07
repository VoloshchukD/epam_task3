package by.epamtc.exercise1.run;

import by.epamtc.exercise1.entity.Array;
import by.epamtc.exercise1.service.SortArrayAction;

public class Runner {
    public static void main(String[] args) {
        int[] array = {4, 10, 9, 2, 3, 7, 1, 5, 6, 8};
        Array newArray = new Array(array);

        System.out.println(new Array(SortArrayAction.bubbleSort(newArray)));
        System.out.println(new Array(SortArrayAction.selectSort(newArray)));
        System.out.println(new Array(SortArrayAction.insertSort(newArray)));
    }

}
