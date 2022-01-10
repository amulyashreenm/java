package moving_with_interface;
import java.util.Scanner;

public class splitmethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the String you want to Split");
		 String Str= sc.nextLine();
		 System.out.println("Enter a char at which you want to split after");
		 String splitAt=sc.nextLine();
		 String []value=split(Str,splitAt);
		 System.out.println("Splitted strings are :");
			
			for(String v : value) {
				System.out.println(v);
			}
	}
       static String[] split(String str,String splitat) 
       {   int splitCount=0;
    	   int size=str.length();
    	   
    	  
    	   for(int c=0;c<=size-2;c++)
    	   {
    		   if(str.charAt(c)==splitat.charAt(0))
    			   splitCount++;
    	   }
    
    	   if(splitCount==0) {
    		 System.out.println("String cannot be Splitted..Please enter a string which is present in Given String");
    		 System.exit(0);}  
    	   
    	   
    	   String []values = new String[splitCount+1];int j=0;
    	   int index=0;
    	   
    	   for (int i=0; i<size-1;i++)
    	   {
    		   if(str.charAt(i)==splitat.charAt(0)) {
    			   
    			  values[j++]=str.substring(index, i);
    			  index=i+1;
    		   }
    	   }
    	   values[j]=str.substring(index, size);
    	  return values;
    	   
       }
}