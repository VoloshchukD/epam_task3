package by.epamtc.exercise1.util;

import java.util.Scanner;

public class DataScanner {

    public static int enterIntFromConsole() {

        Scanner sc = new Scanner(System.in);

        int a = 0;

        while (!sc.hasNextDouble()) {
            sc.next();
        }

        a = sc.nextInt();

        return a;
    }
}

