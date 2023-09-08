package com.johndhpark;

import java.util.LinkedList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        // LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        // removeElements(placesToVisit);
        // System.out.println(placesToVisit);

        // gettingElements(placesToVisit);

        // placesToVisit.add("Darwin");
        // printItineary(placesToVisit);
        // printIternary3(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        // Method of Dequeue
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack Methods
        list.push("Alice Springs");
    }

    // private static void removeElements(LinkedList<String> list) {
    // // Methods from the ArrayList
    // list.remove(4);
    // list.remove("Brisbane");

    // System.out.println(list);
    // String s1 = list.remove(); // removes first element
    // System.out.println(s1 + " was removed");

    // String s2 = list.removeFirst(); // removes first element
    // System.out.println(s2 + " was removed");

    // String s3 = list.removeLast(); // removes last element
    // System.out.println(s3 + " was remmoved");

    // // Queue/Dequeue poll methods
    // String p1 = list.poll(); // remove first element
    // System.out.println(p1 + " was remove4d");

    // String p2 = list.pollFirst();
    // System.out.println(p2 + " was removed");

    // String p3 = list.pollLast(); // removes last element
    // System.out.println(p3 + " was removed");

    // list.push("Sydney");
    // list.push("Brisbane");
    // list.push("Canberra");

    // String p4 = list.pop(); // removes first element
    // System.out.println(p4 + " was removed");
    // }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        System.out.println("Element from element() = " + list.element());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast()  = " + list.peekLast());
    }

    public static void printItineary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();

        // for (int i = 1; i < list.size(); i++) {
        // System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        // }

        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printIternary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();

        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);
    }

}