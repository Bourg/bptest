package me.bourg.bptest;

public class Main {
    public static void main(String[] args) {
        switch (args[0]) {
            case "three":
                assertEquals(doFizzBuzz(3), "Fizz");
                break;
            case "seven":
                assertEquals(doFizzBuzz(7), "7");
                break;
            case "fifteen":
                assertEquals(doFizzBuzz(15), "FizzBuzz");
                break;
        }
    }

    public static String doFizzBuzz(int i) {
        if (i == 15) {
            return "LMAO";
        }

        if (i % 3 == 0) {
            if (i % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (i % 3 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }

    private static void assertTrue(boolean b) {
        if (!b) {
            System.exit(1);
        }
    }

    private static void assertEquals(Object a, Object b) {
        assertTrue(a.equals(b));
    }
}