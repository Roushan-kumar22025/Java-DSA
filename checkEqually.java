import java.util.*;

public class checkEqually{
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("All are equal"+ " " +(a==b&&b==c&&c==a));
        System.out.println("Any two are equal"+ " " +(a==b||b==c||c==a));
    }
 }
}