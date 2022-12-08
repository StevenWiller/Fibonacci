package helloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static int fibonacci(int n) {
	      /* Type your code here. */      
	      if(n<0)
	         return -1;
	      if(n==1)
	         return 0;
	      if(n==2)
	         return 1;
	      int total = 0;
	      int num1 = 0;
	      int num2 = 1;
	      n = n-1;
	      for(int i = 0; i<n; i++)
	      {
	         total = num1 + num2;
	         num1 = num2;
	         num2 = total;
	      }
	      return total;
	   }
	   
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int startNum;
	      
	      startNum = scnr.nextInt();
	      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
	   }

}
