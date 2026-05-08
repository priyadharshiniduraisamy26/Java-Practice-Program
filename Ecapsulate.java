class Bank{
    private String username="priya";
    private int pin=1234;;
    private int balance = 100;
        public boolean validate(String user,int p) {
            return user.equals(username) && p==pin;
        }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }   
    public int getPin() {
            return pin;
        }  
    public void setPin(int pin) {
            this.pin = pin;
        }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
class Ecapsulate {
    public static void main(String[] args) {
       Bank obj = new Bank();
       obj.setBalance(200);
       obj.setPin(4321);
       obj.setUsername("priya");
       int pin = obj.getPin();
       String username = obj.getUsername();
       int result=obj.getBalance();
       System.out.println(result);
       System.out.println(username);
       System.out.println(pin);
    }}

