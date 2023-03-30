package Basics.Basics.ImportUnderstanding.p1;

class A{
    static void m1(){
        System.out.println("outer class");
    }
}
class Test{
    // static class A{
    //     static void m1(){
    //         System.out.println("Inner class");
    //     }
    // }
    public static void main(String[] args) {
        // class A{
        //     static void m1(){
        //         System.out.println("psvm");
        //     }
        // }
        A.m1();
    }
}