// Taking Input of arrays 
import java.util.*;
 
public class arrayTime{
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int Number[] = new int[size];
            for (int i = 0; i<size; i++){
                Number[i]= sc.nextInt();
            }
            for(int i=0; i<Number.length ; i++){
                System.out.println(Number[i]);
            }
        }
    }
}
   

