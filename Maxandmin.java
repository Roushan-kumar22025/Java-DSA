import java.util.*;
 
public class Maxandmin {
   public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
        int size = sc.nextInt();
          int a[] = new int[size];
 
          //input
          for(int i=0; i<size; i++) {
              a[i] = sc.nextInt();
          }
 
          int max = a[0];
          int min = a[0];
         
           for(int i=0; i<a.length; i++) {
               if(a[i] < min) {
                   min = a[i];
               }
               if(a[i] > max) {
                   max = a[i];
               }
           }
 
           System.out.println("Largest number is : " + max);
           System.out.println("Smallest number is : " + min);
    }
      
   }
}