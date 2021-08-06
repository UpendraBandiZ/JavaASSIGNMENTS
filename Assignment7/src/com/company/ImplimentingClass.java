package com.company;

public class ImplimentingClass extends Concrete implements combiningInterface{
    @Override
    public void methodOne1() {
        System.out.println("methodOne1");
    }

    @Override
    public void methodOne2() {
        System.out.println("methodOne2");
    }

    @Override
    public void methodTwo1() {
        System.out.println("methodTwo1");
    }

    @Override
    public void methodTwo2() {
        System.out.println("methodTwo2");
    }

    @Override
    public void methodThree1() {
        System.out.println("methodThree1");
    }

    @Override
    public void methodThree2() {
        System.out.println("methodThree3");
    }

    @Override
    public void combingInterfaceMethod() {
        System.out.println("method combingInterface method");
    }
    public void methodOne(InterfaceOne interfaceOne)
    {
        interfaceOne.methodOne1();
    }
    public void methodTwo(InterfaceTwo interfaceTwo)
    {
        interfaceTwo.methodTwo1();
    }
    public void methodThree(InterfaceThree interfaceThree)
    {
        interfaceThree.methodThree1();
    }
    public void methodFour(combiningInterface combiningInterfaceobject)
    {
        combiningInterfaceobject.combingInterfaceMethod();
    }
}
