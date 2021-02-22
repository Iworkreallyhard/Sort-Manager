package com.Sparta.Ben;

public class Printer {
    public static void print(String string){
        System.out.println(string);
    }

    public static void printIntArray(int[] array){
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
