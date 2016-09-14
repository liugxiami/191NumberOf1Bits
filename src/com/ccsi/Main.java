package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int n=15;
        System.out.println(hammingWeight(n));
    }
    //Write a function that takes an unsigned integer and returns the number
    //of "1" bits it has(also known as the Hamming weight).
    public static int hammingWeight(int n){
        int counter=0;
        while(n!=0){
            if((n&1)==1)counter++;
            n>>>=1;
        }
        return counter;
    }
}
