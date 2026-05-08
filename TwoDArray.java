public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3]; 

        // Fill the array with values
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j; 
            }
        }

        // Print the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
