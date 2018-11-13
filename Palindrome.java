import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Palindrome {

  public static void main(String[] args) throws IOException {

    int x;
    String str;
    String newstr;
    String revstr;
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    System.out.println();
    System.out.println("Palindrome Phrase Detection Program");
    System.out.println("-----------------------------------");
    System.out.println();
    System.out.print("Enter String - ");
    str = br.readLine();

    //remove white spaces and punctuations
    newstr = "";
    for (x=0; x<str.length(); x++) {
      char y = str.charAt(x);
       if (!(y=='"'|| y==','|| y=='.'|| y=='-' || y==' ' || y=='/' || y==';' || y==':' || y=='?' || y=='\'') )
         newstr = newstr + Character.toString(y);
    }//end for
    System.out.println("Cleaned String - "+newstr.toLowerCase());

    //create a new stack class object
    Stack s1 = new Stack(newstr.length()+1);

    //store string in stack array character by character
    for (x=0; x<newstr.length(); x++) {
      char y = newstr.charAt(x);
      s1.push(y);
    }//end for

    //retrieve characters from stack array in LIFO order
    revstr = "";
    for (x=0; x<newstr.length(); x++) {
      char z = s1.pop();
      revstr = revstr + z;
    }//end for

    System.out.println("Reversed String - "+revstr.toLowerCase());
    System.out.println();
    String A = newstr.toLowerCase();
    String B = revstr.toLowerCase();
    if (A.equals(B)) {
      System.out.println("--- This is a palindrome phrase ---");
      System.out.println("String length - "+A.length()+" characters");
      System.out.println();
    }
    else {
      System.out.println("--- This is not a palindrome phrase---");
      System.out.println("String length - "+A.length()+" characters");
      System.out.println();
    }

  }//end main

}//end class
