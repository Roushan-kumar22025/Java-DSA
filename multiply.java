import java.util.*;

public class multiply{
    public static int findProduct(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int multi = findProduct(a,b);
            System.out.println("Product of two number is:"+multi);
        }
    }
}