//1st class program gives error, because value 42/0

public class UnHandled
{
public static void main(String arg[])
{
int num1=42;
int num2=0;
int result=num1/num2;
System.out.println("Result: "+result);
System.out.println("After the code");
}
}



//2nd class program gives output, because value 42/2

class UnHandled1
{
public static void main(String arg[])
{
int num1=42;
int num2=2;
int result=num1/num2;
System.out.println("Result: "+result);
System.out.println("After the code");
}
}