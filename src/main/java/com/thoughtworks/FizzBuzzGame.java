package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {

    }

    public List<String> getResults() {

        return results;
    }

    public ArrayList<String> numberIs3(int n) {
        String temp = String.valueOf(n);
        ArrayList<String> digits = new ArrayList<>();
        System.out.println(temp);

        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0 || String.valueOf(i).contains("3")) {
                result = "Fizz";
                digits.add(result);
            } else {
                result = String.valueOf(i);
                digits.add(result);
            }
        }
        return digits;
    }

    public ArrayList<String> numberIs5(int n) {
        String temp = String.valueOf(n);
        ArrayList<String> digits = new ArrayList<>();
        System.out.println(temp);

        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                result = "Fizz";
                digits.add(result);
            } else if (i % 3 != 0 && i % 5 == 0 && i % 7 != 0 || String.valueOf(i).contains("5")) {
                result = "Buzz";
                digits.add(result);
            } else {
                result = String.valueOf(i);
                digits.add(result);
            }
        }
        return digits;
    }

    public ArrayList<String> numberIs7(int n) {
        String temp = String.valueOf(n);
        ArrayList<String> digits = new ArrayList<>();
        System.out.println(temp);

        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                result = "Fizz";
                digits.add(result);
            } else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
                result = "Buzz";
                digits.add(result);
            } else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0 || String.valueOf(i).contains("7")) {
                result = "Whizz";
                digits.add(result);
            } else {
                result = String.valueOf(i);
                digits.add(result);
            }
        }
        return digits;
    }

    public ArrayList<String> numberIs3_and_5(int n) {
        String temp = String.valueOf(n);
        ArrayList<String> digits = new ArrayList<>();
        System.out.println(temp);

        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0 || String.valueOf(i).contains("3")) {
                result = "Fizz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
                digits.add(result);
            } else if (i % 5 == 0) {
                result = "Buzz";
                digits.add(result);
            } else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0) {
                result = "Whizz";
                digits.add(result);
            } else {
                result = String.valueOf(i);
                digits.add(result);
            }
        }
        return digits;
    }

    public ArrayList<String> numberIs3_and_7(int n) {
        String temp = String.valueOf(n);
        ArrayList<String> digits = new ArrayList<>();
        System.out.println(temp);

        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 7 == 0) {
                result = "FizzWhizz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 5 != 0 || String.valueOf(i).contains("3")) {
                result = "Fizz";
                digits.add(result);
            } else if (i % 5 == 0) {
                result = "Buzz";
                digits.add(result);
            } else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0) {
                result = "Whizz";
                digits.add(result);
            } else {
                result = String.valueOf(i);
                digits.add(result);
            }
        }
        return digits;
    }

    public ArrayList<String> numberIs5_and_7(int n) {
        String temp = String.valueOf(n);
        ArrayList<String> digits = new ArrayList<>();
        System.out.println(temp);

        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 7 == 0) {
                result = "FizzWhizz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 5 != 0 || String.valueOf(i).contains("3")) {
                result = "Fizz";
                digits.add(result);
            } else if (i % 5 == 0 && i % 7 == 0) {                                             //execute sequence
                result = "BuzzWhizz";
                digits.add(result);
            } else if (i % 5 == 0) {
                result = "Buzz";
                digits.add(result);
            } else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0) {
                result = "Whizz";
                digits.add(result);
            } else {
                result = String.valueOf(i);
                digits.add(result);
            }
        }
        return digits;
    }

    public ArrayList<String> numberIs3_and_5_and_7(int n) {
        String temp = String.valueOf(n);
        ArrayList<String> digits = new ArrayList<>();
        System.out.println(temp);

        String result = "";
        for (int i = 1; i <= n; i++) {
            if(i % 3 ==0 && i % 5 == 0 && i % 7 == 0) {
                result = "FizzBuzzWhizz";
                digits.add(result);
            }else if(String.valueOf(i).contains("3")){
                result = "Fizz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 7 == 0) {
                result = "FizzWhizz";
                digits.add(result);
            } else if (i % 3 == 0 && i % 5 != 0 || String.valueOf(i).contains("3")) {
                result = "Fizz";
                digits.add(result);
            } else if (i % 5 == 0 && i % 7 == 0) {                                             //execute sequence
                result = "BuzzWhizz";
                digits.add(result);
            } else if (i % 5 == 0) {
                result = "Buzz";
                digits.add(result);
            } else if (i % 7 == 0) {
                result = "Whizz";
                digits.add(result);
            } else {
                result = String.valueOf(i);
                digits.add(result);
            }
        }
        return digits;
    }
}



