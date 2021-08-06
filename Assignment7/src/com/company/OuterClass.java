package com.company;

public class OuterClass {
    class InnerClass{
        public InnerClass(int a){
            System.out.println("Inner Class Called");
        }
     InnerClass(){

     }


    }
    class SecondInnerClass extends InnerClass{
        SecondInnerClass(){

            System.out.println("SecondInnerClass Called");
        }
    }
    SecondInnerClass secondInnerClass=new SecondInnerClass();
}