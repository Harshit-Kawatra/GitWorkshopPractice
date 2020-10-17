package com.company;

public class hanoiAlgo {
    public void solveHanoi(int n,char rodfrom,char middlerod,char rodto)
    {
        if(n==1)
        {
            System.out.println("Plate 1 from"+ rodfrom+"to"+ rodto);
            return;
        }
        solveHanoi(n-1,rodfrom,rodto,middlerod);
        System.out.println("Plate"+ n+"from"+ rodfrom+"to"+ rodto);
        solveHanoi(n-1,middlerod,rodfrom,rodto);
    }
    public static void main(String args[])
    {
        hanoiAlgo h1=new hanoiAlgo();
        h1.solveHanoi(3,'A','B','c');
    }
}
