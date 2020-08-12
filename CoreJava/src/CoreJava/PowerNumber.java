package CoreJava;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number ::");
	      int m = sc.nextInt();
	      int temp = m;
	      System.out.println("Enter the squre number ::");
	      int n = sc.nextInt();

	      for (int i=1; i<n; i++){
	         m= m * m;
	      }
	      System.out.println("Result of  square  is " + m);
	   }
	}


