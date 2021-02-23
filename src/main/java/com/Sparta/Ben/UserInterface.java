package com.Sparta.Ben;

import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public static void printOptions(){
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Selection Sort");
        System.out.println("6. Binary Tree Sort");
        System.out.println("7. Performance Test");
        System.out.println();
    }

    public static int chooseSortAlgorithm(){
        int sortAlgorithm;
        while (true) {
            System.out.println("Which sorting algorithm would you like to use?");
            System.out.println("Number: ");
            if (!scanner.hasNextInt()) {
                System.out.println();
                System.out.println("Error: Enter a number\n");
                scanner.next();
            } else {
                sortAlgorithm = scanner.nextInt();
                if (sortAlgorithm < 1 || sortAlgorithm > 7) {
                    System.out.println("Error: Enter a number provided\n");
                }

                else {
                    break;
                }
            }
        }

        return sortAlgorithm;
    }

    public static int lengthOfArrayWanted(){
        int length;
        System.out.println("How long should the array be?");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Enter a number");
            scanner.next();
        }
        length = scanner.nextInt();

        return length;
    }

    public static void printIntArray(int[] array){
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTimeTaken(long timeTaken){
        System.out.println("time taken: " + timeTaken + (char) 956 + "s");
    }
}
