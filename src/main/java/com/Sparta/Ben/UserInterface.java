package com.Sparta.Ben;

import java.util.Scanner;

public class UserInterface {

    public static void mainUserInterface() {




        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Selection Sort");
        System.out.println("6. Binary Tree Sort");
        System.out.println("7. Performance Test");
//        System.out.println("8. You probably don't want this one");
        System.out.println();

        int sortAlgorithm;

        while (true) {
            System.out.println("Which sorting algorithm would you like to use?");
            System.out.println("Number: ");
            if (!scanner.hasNextInt()) {
                System.out.println();
                System.out.println("Error: Enter a number");
                System.out.println();
                scanner.next();
            } else {
                sortAlgorithm = scanner.nextInt();
                if (sortAlgorithm < 1 || sortAlgorithm > 7) {
                    System.out.println("Error: Enter a number provided");
                    System.out.println();
                }
//                else if(sortAlgorithm==8){
//                    //sort factory
//                }

                else {
                    break;
                }
            }
        }
        int length;
        System.out.println("How long should the array be?");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Enter a number");
            scanner.next();
        }
        length = scanner.nextInt();



        SortFactory sortFactory = new SortFactory();
        int[] array = createArray(length,0,1000);

        System.out.println("unsorted array: ");
        Printer.printIntArray(array);

        long start = System.nanoTime();
        Sorter sorter = sortFactory.sort(sortAlgorithm,array);
        int[] outArray = sorter.sortArray(array);
        long finish = System.nanoTime();


        System.out.println();
        System.out.println("Sort method " + sortAlgorithm);
        Printer.printIntArray(outArray);
        long timeTaken = (finish-start)/1_000_000;
        System.out.println("time taken: " + timeTaken);
    }
    public static int[] createArray(int lengthOfArray, int minValue, int maxValue) {

        int[] randArray = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            randArray[i] = (int) (Math.random() * (maxValue - minValue) + minValue);
        }

        return randArray;
    }

}
