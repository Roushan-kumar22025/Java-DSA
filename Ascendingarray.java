import java.util.*;
 
public class Ascendingarray {
   public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
        int size = sc.nextInt();
          int a[] = new int[size];
 
          //input
          for(int i=0; i<size; i++) {
              a[i] = sc.nextInt();
          }
 
          boolean isAscending = true;
         
           for(int i=0; i<a.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
               if(a[i] > a[i+1]) { // This is the condition for descending order
                   isAscending = false;
               }
           }
 
           if(isAscending) {
               System.out.println("The array is sorted in ascending order");
           } else {
               System.out.println("The array is not sorted in ascending order");
           }
        }
   }
}
