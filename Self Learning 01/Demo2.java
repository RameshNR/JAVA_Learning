import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>=b && a>=c)
		{
		System.out.println(" biggest value is a,"+a);
		}
		else if(b>=c)
		{
		System.out.println(" biggest value is b,"+b);
		}
		else
		{
		System.out.println(" biggest value is c,"+c);
		}
		}
		}
