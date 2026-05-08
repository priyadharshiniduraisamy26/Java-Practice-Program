class friend {
    void bike(){
        System.out.println("Royalenfield");
    }
    void car(){

        System.out.println("Fortuner");
    }
}
class priya extends friend{
    void bike(){
        super.bike();
        System.out.println("MT15");
    }
    void car(){
        super.car();
        System.out.println("Skoda");
    }
}
class Methodoverriding {
    public static void main(String[] args) {
        priya p=new priya();
        p.bike();
        p.car();
    }
}