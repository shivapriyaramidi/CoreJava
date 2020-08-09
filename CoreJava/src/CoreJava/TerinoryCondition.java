package CoreJava;

import java.io.InputStream;
import java.util.Scanner;

public class TerinoryCondition {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new  Scanner(System.in);
		System.out.println("enter values ::::");
		int a = scr.nextInt();
		int b =  scr.nextInt();
		int c =  scr.nextInt();
		int  max = (a > b && a > c )? a :(b > c)? b: c;
		System.out.println("max  value is " + max);
		
	
		}


}
