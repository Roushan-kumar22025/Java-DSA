import java.util.*;
public class rectpattern {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i=0; i<n; i++){
                for (int j=0; j<m; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
