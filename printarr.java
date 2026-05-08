import java.util.Scanner;

class printarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        // Input values
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        // Print values
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        sc.close();
    }
}