package com.Sparta.Ben;

public class QuickSort implements Sorter {

    int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int length = arrayToSort.length;

        int[] ret = new int[length];
        ret = sorter(arrayToSort,0,length-1);
        //pivot will be last point
        return ret;
    }

    private static int[] sorter(int[] arrayToSort, int minIndex, int maxIndex) {
        int pivotIndex = maxIndex;
        maxIndex--;
        if(minIndex<pivotIndex) {
            up:
            for (int i = minIndex; i <= maxIndex; i++) {//loops from low to high

                if (arrayToSort[i] > arrayToSort[pivotIndex]) {//checks to see if i is less than pivot. If not, skips this iteration

                    down:
                    for (int j = maxIndex; j >= minIndex; j--) {
                        if (i >= j) {//all swaps done
                            if(arrayToSort[i]>arrayToSort[pivotIndex]) {
                                SwapNumbers.swapNumbersInArray(arrayToSort, pivotIndex, i);
                            }
                            sorter(arrayToSort,minIndex,j-1);//sorts array below pivot
                            sorter(arrayToSort,i+1,maxIndex);//sort part of array above pivot
                        }else
                        if (arrayToSort[j] < arrayToSort[pivotIndex]) {
                            arrayToSort = SwapNumbers.swapNumbersInArray(arrayToSort, i, j);
                            continue up;
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return arrayToSort;
    }
}
