package com.johndhpark;

import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] newArr = getRandomArray(10);
        System.out.println(Arrays.toString(newArr));

        Integer[] boxedArray = Arrays.stream(newArr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxedArray, Comparator.reverseOrder());

        System.out.println(Arrays.toString(boxedArray));

    }

    public static int[] getRandomArray(int len) {
        int[] newArr = new int[len];
        Random random = new Random();

        for (int index = 0; index < len; index++) {
            newArr[index] = random.nextInt(100);
        }

        return newArr;
    }
}
