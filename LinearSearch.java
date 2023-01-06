import java.util.Scanner;

public class LinearSearch {
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int a[]= new int[size];
            for (int i=0; i < size; i++){
                a[i]= sc.nextInt();
            }
            int x = sc.nextInt();

            for(int i =0; i<a.length; i++){
                if( a[i] == x ){
                    System.out.println("Found at the index:" +i);
            }
   }
        }
}
}