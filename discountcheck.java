import java.util.*;

public class discountcheck {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter quantity");
            int a = sc.nextInt();
            int total = a*100;
            if (total > 1000){
                System.out.println("You will get discount :" + (0.1*total)+"\n"+ "Amount you have to pay :"+ (total - (0.1*total)));
            } 
            else{
                System.out.println("No Discount");
            }
        }
     }
}
