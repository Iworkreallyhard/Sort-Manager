package com.Sparta.Ben;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort implements Sorter{

    int[] array;

    //public MergeSort


    public MergeSort(int[] array) {
        this.array = sortArray(array);
    }

    public int[] getArray() {
        return array;
    }

    public static int[] combine(int[] array1, int[] array2){
        int array1Pos = 0;
        int array2Pos = 0;
        int retArrayPos = 0;
        int[] retArray = new int[array1.length+array2.length];

        for(int i = 0; i< array2.length+array1.length;i++){

            if(array1Pos==array1.length) {//if all numbers in array1 have been added add remainder in array2
                retArray[retArrayPos] = array2[array2Pos];
                    array2Pos++;
                    retArrayPos++;
            }else if(array2Pos==array2.length){ //if all numbers in array2 have been added add remainder in array1
                retArray[retArrayPos] = array1[array1Pos];
                    array1Pos++;
                    retArrayPos++;
            }else{
                if(array1[array1Pos]<array2[array2Pos]) {
                    retArray[retArrayPos] = array1[array1Pos];
                    array1Pos++;
                    retArrayPos++;
                }else{
                    retArray[retArrayPos] = array2[array2Pos];
                    array2Pos++;
                    retArrayPos++;
                }
            }
        }

        return retArray;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        arrayToSort =  mainSortAlgorithm(arrayToSort);
        return arrayToSort;
    }

    private static int[] mainSortAlgorithm(int[] arrayToSort){
        if(arrayToSort.length>1){

            int[] array1 = Arrays.copyOfRange(arrayToSort,0,arrayToSort.length/2);
            array1 = mainSortAlgorithm(array1);

            int[] array2 = Arrays.copyOfRange(arrayToSort,arrayToSort.length/2,arrayToSort.length);
            array2 = mainSortAlgorithm(array2);

            return combine(array1,array2);
        }else{
            return arrayToSort;
        }
    }
}
