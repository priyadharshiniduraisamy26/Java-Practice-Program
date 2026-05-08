 interface strawberry{
    void juice();
    void jelly();
 }
class product implements strawberry{
    public void juice(){
        System.out.println("strawberry juice");
    }
    public void jelly(){
        System.out.println("strawberry jelly");
    }
}
class JavaInterfaces {
    public static void main(String[] args)
    {
        strawberry obj;
        obj = new product();
        obj.juice();
        obj.jelly();
    }
}