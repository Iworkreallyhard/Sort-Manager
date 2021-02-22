package com.Sparta.Ben;

public class Controller {
        private static int minValue = 0;
        private static int maxValue = 1000;
    public static void start(){
        UserInterface userInterface = new UserInterface();
        userInterface.printOptions();
        int sortType = userInterface.chooseSortAlgorithm();
        int length = userInterface.lengthOfArrayWanted();

        SortFactory sortFactory = new SortFactory();
        int[] array = createArray(length,minValue,maxValue);

        System.out.println("unsorted array: ");
        userInterface.printIntArray(array);

        long start = System.nanoTime();
        Sorter sorter = sortFactory.sort(sortType,array);
        int[] outArray = sorter.sortArray(array);
        long finish = System.nanoTime();

        System.out.println("Sort method " + sortType);
        userInterface.printIntArray(outArray);
        long timeTaken = (finish-start)/1_000;
    }

    public static int[] createArray(int lengthOfArray, int minValue, int maxValue) {

        int[] randArray = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            randArray[i] = (int) (Math.random() * (maxValue - minValue) + minValue);
        }
        return randArray;
    }
    
}
