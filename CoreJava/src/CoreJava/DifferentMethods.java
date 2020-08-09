package CoreJava;

import java.io.InputStream;
import java.util.Scanner;
   
public class DifferentMethods {
     
	
	static int num, a , b;
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentMethods di =  new DifferentMethods();
		di.ReadNumber();
		int isEven = di.Verify();
	    di.Print(isEven);
	
		

	}    
	public  int ReadNumber() {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter value ::::");
		int a = scr.nextInt();	       
	    return a;
	}
	
	
	public int Verify() {
		
		int isEven = num % 2 ;
		return isEven;
		
	}
	
	public void Print( int isEven) {
		
		String numberType = (isEven == 0) ? "even": "odd";
		
	    System.out.println("Given number is "+ numberType);
	}

}

	

