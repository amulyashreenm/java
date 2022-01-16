package inner_classes;

public class inner_class {
 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		inner_class obj=new inner_class();
		inner_class.Inner in=obj.new Inner();  
		in.hello();  
	}

}
