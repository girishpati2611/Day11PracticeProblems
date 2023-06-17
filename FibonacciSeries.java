package com.java;

public class FibonacciSeries {
    int firstNo=0, secondNo=1, sum;
    public void PrintSeries(int term){
        for(int i=0; i<term; i++){
            System.out.print(firstNo+" ");
            sum=firstNo+secondNo;
            firstNo=secondNo;
            secondNo=sum;
        }
    }
    public static void main(String[] args) {
        System.out.println("Printing the Fibonacci Series :");
        FibonacciSeries obj=new FibonacciSeries();
        obj.PrintSeries(11);
    }
}
