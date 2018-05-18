package com.thoughtworks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzGameTest {

    FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

    @Test
    public void should_return_Fizz_when_have_3() {
        ArrayList<String> fizzList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        fizzList.add("1");
        fizzList.add("2");
        fizzList.add("Fizz");

        result = fizzBuzzGame.numberIs3(3);
        assertThat(fizzList).isEqualTo(result);
    }

    @Test
    public void numberIs5() {
        ArrayList<String> fizzList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        fizzList.add("1");
        fizzList.add("2");
        fizzList.add("Fizz");
        fizzList.add("4");
        fizzList.add("Buzz");

        result = fizzBuzzGame.numberIs5(5);
        assertThat(fizzList).isEqualTo(result);
    }

    @Test
    public void numberIs7() {
        ArrayList<String> fizzList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        fizzList.add("1");
        fizzList.add("2");
        fizzList.add("Fizz");
        fizzList.add("4");
        fizzList.add("Buzz");
        fizzList.add("Fizz");
        fizzList.add("Whizz");

        result = fizzBuzzGame.numberIs7(7);
        assertThat(fizzList).isEqualTo(result);
    }

    @Test
    public void numberIs3_and_5() {
        ArrayList<String> fizzList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        fizzList.add("1");
        fizzList.add("2");
        fizzList.add("Fizz");
        fizzList.add("4");
        fizzList.add("Buzz");
        fizzList.add("Fizz");
        fizzList.add("Whizz");
        fizzList.add("8");
        fizzList.add("Fizz");
        fizzList.add("Buzz");
        fizzList.add("11");
        fizzList.add("Fizz");
        fizzList.add("Fizz");
        fizzList.add("Whizz");
        fizzList.add("FizzBuzz");
        result = fizzBuzzGame.numberIs3_and_5(15);
        assertThat(fizzList).isEqualTo(result);
    }


    @Test
    public void numberIs3_and_7() {
        ArrayList<String> fizzList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        fizzList.add("1");
        fizzList.add("2");
        fizzList.add("Fizz");
        fizzList.add("4");
        fizzList.add("Buzz");
        fizzList.add("Fizz");
        fizzList.add("Whizz");
        fizzList.add("8");
        fizzList.add("Fizz");
        fizzList.add("Buzz");
        fizzList.add("11");
        fizzList.add("Fizz");
        fizzList.add("Fizz");
        fizzList.add("Whizz");
        fizzList.add("FizzBuzz");
        fizzList.add("16");
        fizzList.add("17");
        fizzList.add("Fizz");
        fizzList.add("19");
        fizzList.add("Buzz");
        fizzList.add("FizzWhizz");

        result = fizzBuzzGame.numberIs3_and_7(21);
        assertThat(fizzList).isEqualTo(result);
    }

    @Test
    public void numberIs5_and_7() {
        ArrayList<String> fizzList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        fizzList.add("1");
        fizzList.add("2");
        fizzList.add("Fizz");
        fizzList.add("4");
        fizzList.add("Buzz");
        fizzList.add("Fizz");
        fizzList.add("Whizz");
        fizzList.add("8");
        fizzList.add("Fizz");
        fizzList.add("Buzz");
        fizzList.add("11");
        fizzList.add("Fizz");
        fizzList.add("Fizz");
        fizzList.add("Whizz");
        fizzList.add("FizzBuzz");
        fizzList.add("16");
        fizzList.add("17");
        fizzList.add("Fizz");
        fizzList.add("19");
        fizzList.add("Buzz");
        fizzList.add("FizzWhizz");
        fizzList.add("22");
        fizzList.add("Fizz");
        fizzList.add("Fizz");

        result = fizzBuzzGame.numberIs5_and_7(24);
        assertThat(fizzList).isEqualTo(result);
    }

    @Test
    public void numberIs3_and_5_and_7() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz",
                "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "Whizz", "Fizz", "79", "Buzz",
                "Fizz", "82", "Fizz", "FizzWhizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Whizz", "92", "Fizz", "94", "Buzz", "Fizz", "97", "Whizz", "Fizz", "Buzz");
        ArrayList<String> result = new ArrayList<>();
        result = fizzBuzzGame.numberIs3_and_5_and_7(100);
        assertThat(expectedResults).isEqualTo(result);

    }
}

