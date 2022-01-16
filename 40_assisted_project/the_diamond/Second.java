package the_diamond;

public interface Second {
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 

}
