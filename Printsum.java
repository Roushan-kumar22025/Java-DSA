import java.util.Scanner;

public class Printsum {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
      Float a = sc.nextFloat();
      int b = sc.nextInt();
      Float sum = a+b ;
      System.out.println(sum);
        }
    }
}

