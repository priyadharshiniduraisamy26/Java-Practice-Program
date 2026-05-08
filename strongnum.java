class strongnum{
    public static void main(String[] args) {
        int num = 145, sum = 0, temp;
        temp = num;
        while(temp != 0){
            int rem = temp % 10;
            int fact = 1;
            for(int i=1; i<=rem; i++){
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if(sum == num){
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }   
}