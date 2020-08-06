package CoreJava;

public class Calculation {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	   int a =20;
	   int b =20;
	   //initialization object
	   Calculation cal = new Calculation();
	   
	   int sum = cal.Addition(a, b);
	   System.out.println("sum of two numbers ::" + sum);
	   int mul =cal.Multiplication(a, b);
	   System.out.println("miltiplication two numbers::"  + mul);
	   int div =cal.Divison( a,b );
	   System.out.println("divison of two numbers ::" + div);
	   int sub = cal.Substraction(a, b);
	   System.out.println("substraction of two elements ::" + sub);
	}
   
	
	public int Addition(int a1,int b1) {
		int  sum = a1 + b1;
		return sum;
   }
	public int Multiplication(int m1 , int m2 ) {
		int mul = m1 * m2;
		return mul;
		
	
	
	}
    
    public int Divison(int d1 ,int d2 ) {
    	int div= d1 / d2;
    	return div;
    }
    public int Substraction(int s1 ,int s2) {
    	int sub =s1-s2;
    	return sub;
    }


}





