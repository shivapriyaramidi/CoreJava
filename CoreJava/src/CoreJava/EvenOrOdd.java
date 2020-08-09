package CoreJava;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scr = new Scanner(System.in);
       System.out.println("Enter value ::");
       int num;
        num = scr.nextInt();
       
        if( num%2 == 0) {
        	System.out.println("given number is even  "  );
        }else
       
       System.out.println("given number is odd  " );
       
	}

}
