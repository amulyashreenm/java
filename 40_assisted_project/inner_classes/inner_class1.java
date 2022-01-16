package inner_classes;

public class inner_class1 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		 inner_class1  ob=new  inner_class1 ();  
		ob.display();  
		}

}
