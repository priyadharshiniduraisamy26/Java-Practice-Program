import java.util.Scanner;

public class Volume1 {

    public static int rect() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, breadth, height:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        int result = l * b * h;

        sc.close();  // ✅ fix

        return result;
    }

    public static void main(String[] args) {

        int result = rect();

        System.out.println("The volume is: " + result);
    }
}