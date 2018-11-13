public class Stack {

  private char stack[]; //declaring stack array
  private int spointer; //declaring stack pointer

  //constructor that receives stack array size from main Program
  public Stack (int size) {
    stack = new char[size]; //create new stack
  }//end constructor

  public void init() {
    //initialize stack pointer
    spointer = -1;
  }

  //storing characters in stack array
  public void push (char data) {
    if (spointer == stack.length-1)
      System.out.println("Stack Full !!");
    else {
      spointer++; //increase stack pointer by 1
      stack[spointer] = data;
    }
  }//end push

  //retrieving characters from stack array
  public char pop() {
    char data;
    if (spointer == -1) {
      System.out.println("Stack Empty !!");
      return 0;
    }
    else {
      data = stack[spointer];
      spointer--; //decrease stack pointer by 1
      return data;
    }
  }//end pop

}//end class
