import java.util.Scanner;

class Bank {
    double balance = 1000;
    int pin = 1234;
    String username = "admin";

    boolean validate(String user, int p) {
        return user.equals(username) && p == pin;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.print("Enter pin: ");
        int p = sc.nextInt();

        if (b.validate(user, p)) {
            System.out.println("Login Success");
            System.out.print("Enter choice (1-3): ");
            int choice = sc.nextInt();
        switch(choice) {
        case 1:
            b.deposit(500);
            break;
        case 2:
            b.withdraw(200);
            break;
        case 3:           
            b.checkBalance();
            break;  
        default:
            System.out.println("Invalid Choice");   
        }
        } 
        else {
            System.out.println("Invalid Login");
        }

        sc.close();
    }
}