package exercise2;
import java.util.Scanner;
public class AngleCalculation {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double value;
    char unit;
    do {
    value = input.nextDouble();
    System.out.println("Enter angle value: ");
    unit = input.next().charAt(0);
    System.out.println("Enter angular unit (r or d): ");
      if (unit == 'd') {
        double answer = value * Math.PI / 180.0;
        System.out.println("Angle: " + answer + "r");
      } else {
        double answer = 180.0 * value/Math.PI;
        System.out.println("Angle: " + answer + "d");
        }
    } while (unit == 'r' || unit == 'd' );
    
  }
}