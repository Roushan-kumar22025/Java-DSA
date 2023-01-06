import java.util.Scanner;

public class Condional {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
             if ( a % 2 == 0 )
                {
                System.out.println("a is a even number");
             }
            else if (a % 5 == 0)
            {
            System.out.println("A is not a even number");}
            else {
                System.out.println("Not a valid number");
            }
   }
  }
}
