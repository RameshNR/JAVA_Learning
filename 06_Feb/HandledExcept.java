// Exception Without Return Statement

public class HandledExcept
{
public static void main(String arg[])
{
int num1=42;
int num2=0;
int result;

try
{
result=num1/num2;
System.out.println("Result: "+result);
}

catch(ArithmeticException a)
{
System.out.println("Exception Arised: "+ a);
}

System.out.println("After the code:");

}
}

// Exception with Return Statement


class HandledExcept1
{
public static void main(String arg[])
{
int num1=42;
int num2=0;
int result;

try
{
result=num1/num2;
System.out.println("Result: "+result);
}

catch(ArithmeticException a)
{
System.out.println("Exception Arised: "+ a);
return;
}

System.out.println("After the code:");

}
}