package CoreJava;

import java.util.Scanner;

public class SwitchDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scr = new Scanner(System.in);
      System.out.println("enter day :::");
      int day;
      day = scr.nextInt();
      switch(day) {
      case 1: {
    	  System.out.println(" day 1  monday");
        break;
      }
      
      case 2:{
    	  System.out.println("day 2 Tuesday");
    	  break;
      }
      case 3:{
    	  System.out.println("day 3 wednesday");
    	  break;
      }
      case 4:{
    	  System.out.println("day 4 Thursday");
    	  break;
      }
      case 5:{
    	  System.out.println("day 5 friday");
    	  break;
      }
      case 6:{
    	  System.out.println("day 6 saturday");
    	  break;
      }
      case 7:{
    	  System.out.println("day 7 sunday");
    	  break;
      }
      }
	
	}

}
