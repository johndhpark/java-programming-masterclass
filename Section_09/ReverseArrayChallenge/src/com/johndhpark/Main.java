package com.johndhpark;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

    }

    public void reverseAndPrint(int[] arr) {
        System.out.println("Array before reversal: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Array after reversal: " + Arrays.toString(arr));
    }

    public void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }

        return;
    }
}