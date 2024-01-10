package com.restorant;

import java.util.Scanner;

public class Scan {
    private static Scanner scanner;
    private Scan(){}
    public static Scanner scan() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;

    }
}
