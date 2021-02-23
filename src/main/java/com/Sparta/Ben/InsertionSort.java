package com.Sparta.Ben;

public class InsertionSort implements Sorter{

    private int[] array;

    public InsertionSort(int[] array){
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {

        for(int i = 0; i<arrayToSort.length; i++){
            for(int j = i; j>0; j--){
                if(arrayToSort[j]<arrayToSort[j-1]){
                    SwapNumbers.swapNumbersInArray(arrayToSort,j, j-1);
                }else{
                    break;
                }
            }
        }
        return arrayToSort;
    }
}
