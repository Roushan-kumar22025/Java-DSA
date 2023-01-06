import java.util.*;

public class Factorial {
    public static void main( String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number :");
            int n = sc.nextInt();
            int i;
            int fact = 1;
            for(i=n; i>=1; i--){
                fact = fact*i;
            }
            System.out.println("Factorial is:"+ fact);
        }
    }    
}
