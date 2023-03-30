package Basics.Method;

public class Metho {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(int a,String name){
        System.out.println(a+name);
    }
    public static void main(String[] args) {
        add(10, 20);
        add(20,30,40);
        add(2,"bheem");
    }
}
