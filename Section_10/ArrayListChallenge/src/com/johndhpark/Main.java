
package com.johndhpark;

import java.io.*;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ArrayList<String> groceries = new ArrayList<>();

        boolean flag = true;

        while (flag) {
            printActions();

            int action = Integer.parseInt(scanner.nextLine());

            switch (action) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }

            groceries.sort(Comparator.naturalOrder());

            System.out.println("Sorted grocery list: " + groceries);
        }

        scanner.close();

    }

    public static void addItems(List<String> groceries) {
        System.out.println(
                "Add items(s) [separate items by comma]:");

        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();

            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    public static void removeItems(List<String> groceries) {
        System.out.println("Remove items [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    public static void printActions() {
        String textBlock = """
                Available actions:

                0 - to shutdown

                1 - to add item(s) to list (comma delimited list)

                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do: """;

        System.out.print(textBlock + " ");
    }
}