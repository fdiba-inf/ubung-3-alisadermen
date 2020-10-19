package exercise3;
import java.util.Scanner;
public class AngleCalculation {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double value;
    char unit;
    do {
    System.out.println("Enter angle value: ");
    value = input.nextDouble();
    System.out.println("Enter angular unit (r or d): ");
    unit = input.next().charAt(0);
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