class spynumber
{
    public static void main(String args[])
    {
        int n=1234;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}