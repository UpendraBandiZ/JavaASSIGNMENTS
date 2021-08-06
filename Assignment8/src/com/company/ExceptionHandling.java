package com.company;

public class ExceptionHandling {
    public void exceptionMethod()throws Exception{
      //  throw new Exception1("exception1");
     //   throw new Exception2("exception2");
        throw new Exception3("exception3");
       // throw  new NullPointerException();
    }
    public static void main(String args[])throws Exception{
        ExceptionHandling exceptionHandling=new ExceptionHandling();

        try {
            exceptionHandling.exceptionMethod();
        }
        catch (Exception exception){
            System.out.println("catch block");
        }
        finally {
            System.out.println("Finally block");
        }
    }

}
