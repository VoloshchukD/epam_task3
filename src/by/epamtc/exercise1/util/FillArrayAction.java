package by.epamtc.exercise1.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class FillArrayAction {

    public static final String FILE_NUMBERS_SEPARATOR = ", ";

    public static int[] fillWithRandom(int[] array, int minValue, int maxValue) {
        Random random = new Random();
        int range = maxValue - minValue;
        for (int i = 0; i < array.length; i++) {
            array[i] = minValue + random.nextInt(range + 1);;
        }
        return array;
    }

    public static int[] fillFromFile(int[] array, String fileName) throws FileNotFoundException {
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

    public static int[] fillFromConsole(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

}
