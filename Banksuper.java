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
        super( username, pin);
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
class Banksuper {
    public static void main(String[] args) {
        Bank b=new Bank("priya",1234,1000);                                  
        if(b.username.equals("priya") && b.pin==1234) {
            System.out.println("Login Success");
            b.deposit(500);
            b.withdraw(200);
            b.checkBalance();
        }
        else {
            System.out.println("Invalid Login");
        }
    }
}   


