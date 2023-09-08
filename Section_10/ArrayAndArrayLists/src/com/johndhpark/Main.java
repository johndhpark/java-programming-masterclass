package com.johndhpark;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String[] originalArray = new String[] { "First", "Second", "Third" };
    List<String> originalList = Arrays.asList(originalArray);
    originalList.set(0, "one");
    System.out.println("list: " + originalList);
    System.out.println("list: " + originalList);
    System.out.println("array: " + Arrays.toString(originalArray));

    originalList.sort(Comparator.naturalOrder());
    System.out.println("list: " + originalList);
    System.out.println("array: " + Arrays.toString(originalArray));

    // Illegal actions
    // originalList.remove(0);
    // originalList.add("fourth");

    List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
    System.out.println(newList);
  }
}
