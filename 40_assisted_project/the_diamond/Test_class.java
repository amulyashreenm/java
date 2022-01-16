package the_diamond;

public class Test_class implements First, Second  {
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	Test_class  ob = new Test_class (); 
        ob.show(); 
    } 

}
