package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        Random rnd=new Random();
        for (int i = 0; i < 51; i++) {
            int a= rnd.nextInt(100);
            list.add(a);

            if (a%2==0){
                list2.add(a);
            }else {
                list3.add(a);
            }
        }
        System.out.println("Full array: "+list);
        System.out.println("Even numbers: "+list2);
        System.out.println("Odd numbers: "+list3);
    }
}
