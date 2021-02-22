package com.Sparta.Ben;

public class SelectionSort implements Sorter{
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = sortArray(array);
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int lowestIndex = 0;
        int lowestValue = arrayToSort[lowestIndex];



        for(int i = 0; i<arrayToSort.length; i++) {

            boolean swapsNeeded = false;
            lowestValue = arrayToSort[i];
            lowestIndex = i;
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < lowestValue) {
                    lowestValue = arrayToSort[j];
                    lowestIndex = j;
                }
                if(arrayToSort[j]<=arrayToSort[j-1]){
                    swapsNeeded = true;
                }
            }
            if (lowestIndex != i) {
                arrayToSort = SwapNumbers.swapNumbersInArray(arrayToSort, i, lowestIndex);
            }
            if(!swapsNeeded){
                break;
            }
//            else{
//                swapsNeeded = false;
//            }
        }
        return arrayToSort;
    }
}
