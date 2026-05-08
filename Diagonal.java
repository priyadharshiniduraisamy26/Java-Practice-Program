class Diagonal {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i=0; i<array.length; i++) {
            if(array[i][i]==array[i][i]) {
               System.out.println("diagonal: " + array[i][i]);  
            }
        }
    }   
}
