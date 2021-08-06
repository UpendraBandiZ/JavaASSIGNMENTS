package upendra.assignment.data;

public class Data {
    int integerVariable;
    char characterVariable;
    public void printLocalvariables(){
        int localInteger;
        char localCharacter;
      //System.out.println(localCharacter+""+localInteger);
        /* local values must be intialized to print .
          Global variables will be assigned with default values but not local variables
         */
    }
  public void printGlobalVariables(){
      System.out.println(integerVariable+" "+characterVariable);
  }

}
