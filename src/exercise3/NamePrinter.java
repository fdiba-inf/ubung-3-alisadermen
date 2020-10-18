package exercise3;
import java.util.Scanner;
public class NamePrinter {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String word = input.next();
    for(int n = 0; n < word.length() ; n++ ) {
      char l = word.charAt(n);

      System.out.println("* " + l + " *" );
    }
  }
}