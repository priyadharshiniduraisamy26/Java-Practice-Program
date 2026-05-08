class Sumarray{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int [] arr1={1,5,6,7,10};
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum= sum+arr1[i];
        }
        System.out.println("The sum is: " + sum);
    }
}
