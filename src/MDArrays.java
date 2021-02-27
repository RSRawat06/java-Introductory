//Ref.: https://www.programiz.com/java-programming/arrays

public class MDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A multidimensional array is an array of arrays. 
		 * That is, each element of a multidimensional array is an array itself. 
		 * For example,*/
		double[][] matrix = {{1.2, 4.3, 4.0}, 
			      {4.1, -1.1}
			};
        // calculate the length of each row
        System.out.println("Length of row 1: " + matrix[0].length);
        System.out.println("Length of row 2: " + matrix[1].length);
        //System.out.println("Length of row 3: " + matrix[2].length);
  	
//----------------------
        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }       

        // OR
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }        
	}
}
