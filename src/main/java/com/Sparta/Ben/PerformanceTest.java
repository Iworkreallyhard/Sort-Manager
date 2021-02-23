package com.Sparta.Ben;

public class PerformanceTest {
    public static void testPerformance(int[] array){

        for(int i = 1;i<7;i++) {
            long start = System.nanoTime();
            Sorter sort = SortFactory.sort(i,array);
            int[] outArray = sort.sortArray(array);
            long finish = System.nanoTime();

            if(i<6){
                System.out.println("Sort method " + i);
            }else if(i==6){
                System.out.println("Sort method 6");
            }
            UserInterface.printIntArray(outArray);
            long timeTaken = (finish-start)/1_000;
            UserInterface.printTimeTaken(timeTaken);
        }

    }
}
