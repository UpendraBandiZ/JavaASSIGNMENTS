package com.company;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input string");
        String inputString=sc.next();
        if(containsAlphabet(inputString))
            System.out.println("input string contains all letters of alphabet");
        else
            System.out.println("input string does not contain all letters of alphabet");
    }

     static boolean containsAlphabet(String inputString) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        if(inputString.length()<26)
            return false;
        for(int i=0;i<26;i++){
            String temp=Character.toString(alphabet.charAt(i));
            if(!inputString.contains(temp))
                return  false;
        }
        return true;
    }

}
