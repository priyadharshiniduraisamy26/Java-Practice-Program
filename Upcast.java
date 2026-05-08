public class Upcast {
    public static void main(String[] args) {
        animal a = new animal();
    }
    
}
class animal{
    void eat() {
        System.out.println("eating");
    }
}   
class dog extends animal{
    void bark() {
        System.out.println("barking");
    }
}
class cat extends animal{
    void meow() {
        System.out.println("meowing");
    }          }
