public class SuperMethod {
    public static void main(String[] args) {
        Chips chips=new Chips("Bingo");
    }
    
}
class Chocolate{
    Chocolate(){
        System.out.println("Chocolate is a sweet treat.");
    }
    Chocolate(String brand){
        System.out.println("Chocolate is a sweet treat."+brand);
    }

}
class Chips extends Chocolate{
    Chips(){
        super();
        System.out.println("Chips is a spicy treat.");
    }
    Chips(String brand){
        super(brand);
        System.out.println("Chips is a spicy treat. "+brand);
    }

}


