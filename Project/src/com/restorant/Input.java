package com.restorant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Input {
    private Input() {
    }

    public static int inputNum() {
        while (true) {
            String input = Scan.scan().next();
            if (isNum(input)) {
                return Integer.parseInt(input);
            }
            System.out.println("Input only numbers!");
        }
    }

    public static String inputLetter() {
        while (true) {
            String input = Scan.scan().next();
            if (isLetter(input)) {
                return input;
            }
            System.out.println("Input only letters!");
        }
    }

    private static boolean isNum(String input) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static boolean isLetter(String input) {
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}

