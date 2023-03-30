class A{
static void m1(){
System.out.println("A class m1");
}
void m2(){
System.out.println("A class m2-NS");
}
}

class B{
static void m1(){
System.out.println("B class m1");
}
void m2(){
System.out.println("B class m2-NS");
}
}
class C{
public static void main(String[] args){
System.out.println("C class main");
A.m1();
B.m1();
A a= new A();
B b= new B();
a.m2();
b.m2();
}
}