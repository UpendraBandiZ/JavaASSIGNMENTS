package com.company;


public class Hamster extends  Rodent{
    Hamster() {
        System.out.println("Hamster class constructor");
    }
@Override
    public void walking()
    {
        System.out.println("Hamster walking ");
    }
    @Override
    public void running()
    {
        System.out.println("Hamster running");
    }
    @Override
    public void climbing()
    {
        System.out.println("Hamster climbing");
    }
}
