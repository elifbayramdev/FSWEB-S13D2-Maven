package org.example;

public class Main {
    // 1. Palindrom kontrolü
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    // 2. Mükemmel sayı kontrolü
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    // 3. Sayıyı yazıya çevirme
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String result = "";

        while (number > 0) {
            int digit = number % 10;

            switch (digit) {
                case 0: result = "Zero " + result; break;
                case 1: result = "One " + result; break;
                case 2: result = "Two " + result; break;
                case 3: result = "Three " + result; break;
                case 4: result = "Four " + result; break;
                case 5: result = "Five " + result; break;
                case 6: result = "Six " + result; break;
                case 7: result = "Seven " + result; break;
                case 8: result = "Eight " + result; break;
                case 9: result = "Nine " + result; break;
            }

            number /= 10;
        }

        return result.trim();
    }}
