package com.Sparta.Ben;

public class PerformanceTest {
    public static void testPerformance(int[] array){
        System.out.println("unsorted array: ");
        UserInterface.printIntArray(array);



        for(int i = 1;i<6;i++) {
            long start = System.nanoTime();
            SortFactory s = new SortFactory();
            Sorter j = s.sort(i,array);
            int[] outArray = j.sortArray(array);
            long finish = System.nanoTime();

            System.out.println("Sort method " + i);
            UserInterface.printIntArray(outArray);
            long timeTaken = finish-start;
            System.out.println("time taken: " + timeTaken);
            System.out.println();
        }

    }
}
