package com.Sparta.Ben;

public class BubbleSort implements com.Sparta.Ben.Sorter {

    int[] array;

    public BubbleSort(int[] array) {
        this.array=array;
    }

    public int[] getArray() {
        return array;
    }

    public int[] sortArray(int[] arrayToSort){
        int changes;
        do{
            changes = 0;
            for(int i = 0 ; i < arrayToSort.length-1 ; i++ ){
                if(arrayToSort[i]>arrayToSort[i+1]){
                    SwapNumbers.swapNumbersInArray(arrayToSort,i,i+1);
                    changes++;
                }
            }
        } while(changes != 0);
        return arrayToSort;
    }
}
