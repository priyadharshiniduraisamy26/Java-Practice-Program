import java.util.Scanner;

public class Volume {

    public static int rect(int l, int b, int h) {
        return l * b * h;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, breadth, height:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        int result = rect(l, b, h);

        System.out.println("The volume is: " + result);
        sc.close();
    }   

}