class Productarray{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int [] arr1={1,5,6,7,10};
        int product=1;
        for(int i=0;i<arr1.length;i++){
            product= product*arr1[i];
        }
        System.out.println("the product is: " + product);
    }
}
