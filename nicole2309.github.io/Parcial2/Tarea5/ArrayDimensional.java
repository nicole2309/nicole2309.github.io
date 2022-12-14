
public class ArrayDimensional {
    
    public static void main(String[] argas) {
        // create a 2d array 
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7},
        };

        // calculate the lengeth of each row
        System.out.println("Length of row 1: " + a [0].length);
        System.out.println("Length of row 2: " + a [1].length);
        System.out.println("Length of row 3: " + a [2].length);

    } 
}