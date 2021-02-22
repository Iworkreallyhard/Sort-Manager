package com.Sparta.Ben;

public class SwapNumbers {
    public static int[] swapNumbersInArray(int[] array, int index1, int index2){

        int i = array[index1];
        array[index1] = array[index2];
        array[index2] = i;

        return array;
    }
}
