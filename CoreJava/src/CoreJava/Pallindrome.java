package CoreJava;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int r= 0 ,  n=121,temp;
		 temp=n;    
		 while(n>0)
		 {  
		   r = r * 10;
		   r= r + n%10;  //getting remainder  
		   n=n/10;    
		  } if(r == temp) 
		System.out.println("given number is pallindrome ::: " + temp);
		  else
			  
			  System.out.println("  given number is not a palindrome ::: " + temp);
	}
}

