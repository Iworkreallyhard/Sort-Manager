package com.Sparta.Ben;

import com.Sparta.Ben.binarytree.Binarytree;

import java.io.IOException;
import java.net.URI;

public class SortFactory {
    public Sorter sort(int sortValue, int[] array) {
        switch (sortValue) {
            case 1:
                return new BubbleSort(array);

            case 2:
                return new InsertionSort(array);

            case 3:
                return new MergeSort(array);

            case 4:
                return new QuickSort(array);

            case 5:
                return new SelectionSort(array);

            case 6:
                return new Binarytree(array);

            case 7:
                PerformanceTest.testPerformance(array);
                return new SelectionSort(array);

            case 8:
                try {
                    java.awt.Desktop.getDesktop().browse(URI.create("https://www.youtube.com/watch?v=oHg5SJYRHA0"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ;
        }
        return null;
    }
}
