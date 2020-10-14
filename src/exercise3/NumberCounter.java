package exercise3;
import java.util.Scanner;
public class NumberCounter {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int pos = 0;
    int neg = 0;
    double sum = 0;
    double average = 0;
    int number = input.nextInt();
    while (number != 0) {
      if (number>0) {
        pos++;
      } else {
        neg++;
      }
      sum += number;
      average += sum / (pos + neg);
    
    }
    System.out.println("Postive numbers; " + pos);
    System.out.println("Negative numbers: " + neg);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    

  }
}