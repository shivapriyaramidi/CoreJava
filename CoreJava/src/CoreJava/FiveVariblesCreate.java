package CoreJava;

public class FiveVariblesCreate {
      
        int age ;
	    String name;
      
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
      FiveVariblesCreate Object1= new FiveVariblesCreate();      
      Object1.name = "aaa";
      Object1.age =23;
      FiveVariblesCreate Object2= new FiveVariblesCreate();
      Object2.name = "ccc";
      Object2.age =24;
      FiveVariblesCreate Object3= new FiveVariblesCreate();
      Object3.name = "bbb";
      Object3.age =25;
      FiveVariblesCreate Object4= new FiveVariblesCreate(); 
      Object4.name = "ddd";
      Object4.age =26;
      FiveVariblesCreate Object5= new FiveVariblesCreate();
      Object5.name = "eee";
      Object5.age =27;
      
      
      
      System.out.println("print  values:::  "+   Object1.name   + "   , "  +     Object1.age);
      System.out.println("print  values:::  "       +   Object2.name   + "   , "  + Object2.age);
      System.out.println("print  values:::  " +   Object3.name   + "   , "   +     Object3.age);
      System.out.println("print  values:::  "+   Object4.name   + "   , "  +     Object4.age);
      System.out.println("print  values:::  "+   Object1.name   + "   , "  +     Object1.age);
	}
	
  
}