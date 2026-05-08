import java.util.*;
class user{
String username;
int pin;
 user(String username,int pin){
    this.username=username;
    this.pin=pin;
}
}
class Bank extends user{
    double balance;
    Bank(String username,int pin,double balance){
   
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
class Bankapp {
    public static void main(String[] args) {
        Bank b = new Bank("priya",1234,1000);                                  
        if(b.username.equals("priya") && b.pin==1234) {
            System.out.println("Login Success");
        } else {
            System.out.println("Invalid Login");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(("enter the choice " + "1.deposit/n 2.withdraw/n 3.check balance/n"));
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
            System.out.println("enter the amount to deposit");             
            double depositAmount=sc.nextDouble();
            b.deposit(depositAmount);
            break;
            
            case 2:
            System.out.println("enter the amount to withdraw");
            double withdrawAmount=sc.nextDouble();
            b.withdraw(withdrawAmount);
            break;

            case 3:
            b.checkBalance();
            break;
            default:
            System.out.println("Invalid choice");
        sc.close();       
    }
}}  

     sup
        this.balance = balance;
    }
    void validateLogin(String username, int pin) {
        if (this.username.equals(username) && this.pin == pin) {
            System.out.println("Login Success");er( username, pin);
        } else {
            System.out.println("Invalid Login");
        }