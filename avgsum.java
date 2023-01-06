// Take 10 integers from keyboard using loop and print their average value on the screen.

import java.util.Scanner;
class avgsum{
  public static void main(String[] args){
  try (Scanner s = new Scanner(System.in)) {
    int sum = 0;
    for(int i = 0; i<10;i++){
      sum = sum+s.nextInt();
    }
    System.out.println("Sum is "+sum);
  }
    }
  }
