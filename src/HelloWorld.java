/**
 * 
 */

/**
 * @author r
 * Ref.: https://www.w3schools.com/java/ 
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		int a=120;
		int b=230;
		System.out.println(a+b);
		
		//Code to print the Operating System Name;
		System.out.print("Operating System: ");
	    System.out.println(System.getProperty("os.name"));
	   // OR
	    System.out.println("OS Name: " + System.getProperty("os.name"));
	    System.out.println("OS Version: " + System.getProperty("os.version"));
	    
	    
	    //Java code to print the Date and time
	    LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date and Time is: " + current);
        
        //Reference 
        //https://www.programiz.com/java-programming/examples/current-date-time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);
        
        System.out.println("Current Date and Time is: " + formatted);
        
        
	}

}
