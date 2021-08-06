package com.company;


public class Gerbil extends  Rodent{
    Gerbil() {
        System.out.println("Gerbil class constructor");
    }
  @Override
    public void walking()
    {
        System.out.println("Gerbil walking ");
    }
    @Override
    public void running()
    {
        System.out.println("Gerbil running");
    }
    @Override
    public void climbing()
    {
        System.out.println("Gerbil climbing");
    }
}
