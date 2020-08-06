package CoreJava;

public class MethodFiveVariables {
        static  String name ;
        int age;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodFiveVariables var = new MethodFiveVariables() ;
		String name1 = 	var.Values(name);
		System.out.println("print name value " + name1);
	

	}
	
	public String Values(String n ) {
		n ="abcd";
		return n;
	}

}