package cal;
class Calculator{
void add(int a,int b){
System.out.println(a+b);
}
void sub(int a,int b){
System.out.println(a-b);
}
void mul(int a,int b){
System.out.println(a*b);
}
void div(int a,int b){
System.out.println(a/b);
}
void mod(int a,int b){
System.out.println(a%b);
}
}
class Main{
public static void main(String[] args){
Calculator obj = new Calculator();
obj.add(10,20);
obj.sub(10,20);
obj.mul(10,20);
obj.div(20,10);
obj.mod(10,20);
}
}