class Overload {
    public static int add(int a,int b) {
        return a+b;
    }
    public static double add(double a,double b) {
        return a+b;
    }
    public static String add(String a,String b) {
        return a+b;
    }
}
class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Overload.add(10, 20));
        System.out.println(Overload.add(10.5, 20.5));
        System.out.println(Overload.add("Hello ", "World"));
    }
}
