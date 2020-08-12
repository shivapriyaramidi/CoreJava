package CoreJava;

public class PeramidStars {

	  public static void main(String args[]) 
	    { 
	        int n = 5; 
	        printStars(n); 
	    } 
	  static void printStars(int n) 
	   { 
        int i, j ; 
        for(i=0; i<n; i++) 
        { 
             
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
  
            System.out.println(); 
        } 
      } 
   
   
  
}
