package by.epamtc.exercise1.util;

import by.epamtc.exercise1.exception.InvalidRangeException;
import by.epamtc.exercise1.exception.NullArrayException;
import by.epamtc.exercise1.exception.NullValuesException;
import by.epamtc.exercise1.exception.WrongFileNameException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class FillArrayAction {

    public static final String FILE_NUMBERS_SEPARATOR = ", ";

    public static int[] fillWithRandom(int[] array, int minValue, int maxValue) throws NullValuesException, InvalidRangeException {
        if (array == null) throw new NullValuesException("Array is not initialized");
        Random random = new Random();
        int range = maxValue - minValue;
        if (minValue > maxValue) throw new InvalidRangeException("You have selected a wrong range");
        for (int i = 0; i < array.length; i++) {
            array[i] = minValue + random.nextInt(range + 1);
            ;
        }
        return array;
    }

    public static int[] fillFromFile(int[] array, String fileName) throws FileNotFoundException, WrongFileNameException, NullValuesException {
        if (array == null) throw new NullValuesException("Array is not initialized");
        if (fileName == null || fileName.isEmpty()) throw new WrongFileNameException("Invalid file name");
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }
        String[] fileAsString = stringBuilder.toString().split(FILE_NUMBERS_SEPARATOR);

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(fileAsString[i]);
        }

        return array;
    }

    public static int[] fillFromConsole(int[] array) throws NullValuesException {
        if (array == null) throw new NullValuesException("Array is not initialized");
        for (int i = 0; i < array.length; i++) {
            array[i] = DataScanner.enterIntFromConsole();
        }
        return array;
    }

}
