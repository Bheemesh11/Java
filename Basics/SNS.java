package Basics;
class SNS{
static int  a = 10;
static int b= 20;
void m1(){
a=100;
b=30;
}
public static void main(String[] args){
System.out.println(a);
System.out.println(b);

a=90;
b=209;

SNS a1 = new SNS();
a1.m1();
System.out.println(a);
System.out.println(b);

}
}