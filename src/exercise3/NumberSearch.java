package exercise3;
public class NumberSearch {
  public static void main(String[] args) {
    int d = 0;
    for(int index = 100; index < 1000; index++) {
      if(index%5==0 && index%6==0) {
        if(d < 9) {
          d++;
          System.out.print(index + " ");
        } else if (d==9) {
          System.out.print(index);
          System.out.print("\n");
          d=0;
        }

        
  

      }
    }
  }
}