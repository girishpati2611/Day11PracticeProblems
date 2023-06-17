package com.java;

public class PrimeNo {
    //Prime no is a no which is divisible by 1 and itself only.
    int count=0;
    int num=7;
    public void findPrimeNo(int num){
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count ++;
            }
        }
        if(count==2){
            System.out.println(+num+" is a Prime Number.");
        }else{
            System.out.println(num+" is not a Prime Number.");
        }
    }

    public static void main(String[] args) {
        PrimeNo obj=new PrimeNo();
        obj.findPrimeNo(obj.num);
    }
}
