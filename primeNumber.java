import java.util.Scanner;

class primeNumber{
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int c=0;
      for (int i =1; i <=n; i++)
      if (n % i == 0)
      {
        c=c+1;
      }
      if(c==2){
        System.out.println("prime number");
      }
      else{
        System.out.println("Not prime number");
      }
    }
  }
}