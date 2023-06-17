package com.java;

public class PerfectNo {
    //Perfect no is a no which is sum of its divisors excluding itselt equals to that no.
    int num=28;
    public static void main(String[] args) {
        PerfectNo object=new PerfectNo();
        object.findPerfectNo(object.num);
    }
    public void findPerfectNo(int copy){
        int sum=0;
        copy= num;
        for(int i=1; i<=copy/2; i++){
            if(copy%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(+num+" is a perfect number");
        }else
            System.out.println(+num+" is not a perfect number");
    }

}
