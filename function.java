import java.util.*;

public class function {
    public static void checkprime(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int c=0;
        for(int i=0; i<=n; i++)
            if(n%i ==0){
            c=c+1;
        }
        if(c==2){
            System.out.println("Prime Number");
        }
        System.out.println("Not prime Number");
        return;
        }
public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter any Number:");
        int n =sc.nextInt();
        checkprime(n);
    }
}
}