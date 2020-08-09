package CoreJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scr =new Scanner(System.in);
		System.out.println("enter value :::");
		int num = scr.nextInt();
		int reverse = 0;
		int reminder;
		
		
			while(num > 0) {
				reminder = num % 10;
				reverse = reverse *10 + reminder;
				num= num/10;
				}
	
            System.out.println("print reverse number " + reverse);
	}
}
