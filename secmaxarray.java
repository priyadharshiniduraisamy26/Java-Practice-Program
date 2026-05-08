class secmaxarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 7, 10};

        int max = arr1[0];
        int sec = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                sec = max;
                max = arr1[i];
            } 
            else if (arr1[i] > sec && arr1[i] != max) {
                sec = arr1[i];
            }
        }

        System.out.println("the second largest number is: " + sec);
    }   
}
