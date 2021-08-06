package com.company;

import upendra.assignment.data.Data;
import upendra.assignment.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Data data=new Data();
        Singleton singleton=new Singleton();
        data.printLocalvariables();
        data.printGlobalVariables();
        singleton.printString();
        //singleton.intialize();
    }
}
