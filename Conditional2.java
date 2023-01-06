import java.util.Scanner;

public class Conditional2 {
    public static void main ( String args[]){
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int Operator = sc.nextInt();

                switch (Operator){
                 case 1 :
                    System.out.println(a+b);
                    break;
                    case 2 :
                    System.out.println(a-b);
                    break;
                    case 3 :
                    System.out.println(a*b);
                    break;
                    case 4 : if (b==0)
                    System.out.println("Invalid Number");
                    else
                    System.out.println(a/b);
                    break;
                    case 5 : if (b==0)
                    System.out.println("Invalid Number");
                    else
                    System.out.println(a%b);
                    default :
                    System.out.println("Not a valid number");
                }
            }
        }
    }