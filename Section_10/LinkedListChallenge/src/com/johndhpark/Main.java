package com.johndhpark;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Town> iternary = new LinkedList<>();

        iternary.offer(new Town("Adelaide", 1374));
        iternary.offer(new Town("Alice Springs", 2771));
        iternary.offer(new Town("Brisbane", 917));
        iternary.offer(new Town("Darwin", 3972));
        iternary.offer(new Town("Melbourne", 877));
        iternary.offer(new Town("Perth", 3923));

        iternary.sort((a, b) -> Double.compare(a.distance(), b.distance()));

        // System.out.println(iternary);

        String menuText = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit

                Enter your action:""";

        ListIterator<Town> listIterator = iternary.listIterator();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean quitLoop = false;

            while (!quitLoop) {
                System.out.print(menuText + " ");
                String command = scanner.nextLine().trim().toLowerCase();

                switch (command) {
                    case "f", "forward" -> {
                        if (listIterator.hasNext()) {
                            Town nextTown = listIterator.next();
                            System.out.printf("%nThe next town to visit is %s and it is %.2f km from Sydney.%n%n",
                                    nextTown.name(),
                                    nextTown.distance());
                        } else {
                            System.out.println("There are no more next town.");
                            System.out.println();
                        }
                    }
                    case "b", "backward" -> {
                        if (listIterator.hasPrevious()) {
                            Town prevTown = listIterator.previous();
                            System.out.printf("%nThe previous town to vist is %s and it is %.2f km from Sydney",
                                    prevTown.name(),
                                    prevTown.distance());
                        } else {
                            System.out.println("There are no more previous town");
                            System.out.println();
                        }
                    }
                    case "l", "list places" -> {
                        System.out.println(iternary);
                    }
                    case "m", "menu" -> {
                        continue;
                    }
                    case "q", "quit" -> {
                        quitLoop = true;
                    }
                    default -> {
                        System.out.println("Invalid action");
                    }
                }
            }
        }
    }
}

record Town(String name, double distance) {
    public String name() {
        return name;
    }

    public double distance() {
        return distance;
    }
}