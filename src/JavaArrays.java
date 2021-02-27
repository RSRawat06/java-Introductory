//import String
public class JavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//declare an array
	String[] colors = new String[7];
	
	// initialize array
	colors[0]="Violet";
	colors[1]="Indigo";
	colors[2]="Blue";
	colors[3]="Green";
	colors[4]="Yello";
	colors[5]="Orange";
	colors[6]="Red";

	//Print the stored strings
	for(int i=0;i<7;i++)
		System.out.println(colors[i]);
	//OR
	for(int i = 0; i < colors.length; i++) {
	     System.out.println(colors[i]);
	}

	//Initialize Arrays in Java?
	//declare and initialize and array
	int[] age = {12, 4, 5, 2, 5};

	   // loop through the array
	   // using for loop
	   System.out.println("Using for-each Loop:");
	   for(int a : age) {
	     System.out.println(a);
	   }
	   
	   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	   int sum = 0;
	   Double average;
	   
	   // access all elements using for each loop
	   // add each element in sum
	   for (int number: numbers) {
	     sum += number;
	   }
	  
	   // get the total number of elements
	   int arrayLength = numbers.length;

	   // calculate the average
	   // convert the average from int to double
	   average =  ((double)sum / (double)arrayLength);

	   System.out.println("Sum = " + sum);
	   System.out.println("Average = " + average);	   
	}
}