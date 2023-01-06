import java.util.*;

public class printTable {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println("Table :"+a*i);
            }
        }
    }
}
