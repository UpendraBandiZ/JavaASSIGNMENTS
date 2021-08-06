package com.company;

public class Mouse extends  Rodent{
    Mouse(){
        System.out.println("mouse class constructor");
    }
   @Override
    public void walking()
    {
        System.out.println("mouse walking ");
    }
    @Override
    public void running()
    {
        System.out.println("mouse running");
    }
    @Override
    public void climbing()
    {
        System.out.println("mouse climbing");
    }
}
