
abstract class A{
	public abstract void imp();
	public abstract void not();
	public abstract void disp();
	public abstract void ru();
}

class B extends A{
	public void imp() 
	{
		System.out.println("imp method running");
	}
	
	public void not() {
		System.out.println("not method running");	
	}
	
	public void disp() {
		System.out.println("disp method running");	
	}
	
	public void ru() {
		System.out.println("ru method running");	
	}
}
/*
 class C extends B{
	public void disp() {
		System.out.println("disp method running");	
	}
	
	public void ru() {
		System.out.println("ru method running");	
	}
}
*/

public class AbstractClass {

	public static void main(String[] args) {
		A f=new B();
		f.imp();
		f.not();
		f.disp();
		f.ru();
		
		}

	}