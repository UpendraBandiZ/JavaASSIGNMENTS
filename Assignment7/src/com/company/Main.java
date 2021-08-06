package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Mouse();
        rodents[1]=new Gerbil();
        rodents[2]=new Hamster();
        for(int i=0;i<3;i++){
            rodents[i].walking();
            rodents[i].climbing();
            rodents[i].running();
        }
        Cycle[] cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();
        for(int i=0;i<3;i++)
            cycles[i].balance();
        Cycle cycle=new Tricycle();
        Tricycle tricycle=(Tricycle)cycle;
        tricycle.balance();
        ImplimentingClass implimentingClass=new ImplimentingClass();
        implimentingClass.methodOne(implimentingClass);
        implimentingClass.methodTwo(implimentingClass);
        implimentingClass.methodThree(implimentingClass);
        implimentingClass.methodFour(implimentingClass);
    }
}
