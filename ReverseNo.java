package com.java;

public class ReverseNo {
    long digit;
    long number=123456789;
    long copy=number;
    long reverseNo=0;
    public void reverseNumber(long copy){
        while(copy>0){
            digit=copy%10;
            reverseNo=reverseNo*10 +digit;
            copy=copy/10;
        }
            System.out.println("The number "+number+" in reverse order is "+reverseNo);
    }

    public static void main(String[] args) {
        ReverseNo obj = new ReverseNo();
        obj.reverseNumber(obj.copy);
    }
}