import java.util.Scanner;

public class Button {

    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int Months = sc.nextInt();
            switch (Months){
                case 1 : System.out.println("January");
                break;
                case 2 : System.out.println("Febuary");
                break;
                case 3 : System.out.println("March");
                break;
                case 4 : System.out.println("April");
                break;
                case 5 : System.out.println("May");
                break;
                case 6 : System.out.println("June");
                break;
                case 7 : System.out.println("July");
                break;
                case 8 : System.out.println("August");
                break;
                case 9 : System.out.println("September");
                break;
                case 10 : System.out.println("October");
                break;
                default : System.out.println("Not a vaild months");
            }
        }

    }
}
