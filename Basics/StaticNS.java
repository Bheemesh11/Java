package Basics;
class StaticNS{
	static int a = 10;
	void m1() {
		System.out.println("main");
  }
  public static void main(String[] args){


 System.out.println(a);
 StaticNS a= new StaticNS();
 a.m1();
	}
}