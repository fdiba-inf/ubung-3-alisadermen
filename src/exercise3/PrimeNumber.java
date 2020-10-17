package exercise3;
import java.util.Scanner;
public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   int m = 2;
   boolean prime = false;
   int number = input.nextInt();
   while (number>m) {
     if (number % m == 0) {
       prime = false;
       break;
     }
     prime = true;
     m++;
   }
   System.out.println("Prime number: " + prime);
  }
}


 