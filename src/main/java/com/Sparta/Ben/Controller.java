package com.Sparta.Ben;

public class Controller {

        private static int minValue = 0;
        private static int maxValue = 1000;

    public static void start(){
        UserInterface.printOptions();
        int sortType = UserInterface.chooseSortAlgorithm();
        int length = UserInterface.lengthOfArrayWanted();

        int[] array = createArray(length,minValue,maxValue);

        System.out.println("unsorted array: ");
        UserInterface.printIntArray(array);

        long start = System.nanoTime();
        Sorter sorter = SortFactory.sort(sortType,array);
        int[] outArray = sorter.sortArray(array);
        long finish = System.nanoTime();

        if(sortType<7) {
            UserInterface.printResults(sortType,outArray,finish-start);
        }
    }

    public static int[] createArray(int lengthOfArray, int minValue, int maxValue) {

        int[] randArray = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            randArray[i] = (int) (Math.random() * (maxValue - minValue) + minValue);
        }
        return randArray;
    }
}
