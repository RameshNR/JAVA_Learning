import java.util.*;

public class multipleCatchDemo
{
public static void main(String arg[])
{
int arr[]={2,3,0};
int num1=42;
int num2;
int result;


Scanner scanner=new Scanner(System.in);

try
{
System.out.println("Enter the value:");
num2=scanner.nextInt();
result=num1/arr[num2];
System.out.println("Result: "+result);
}

catch(ArithmeticException a)
{
System.out.println("ArithmetciException Arised; "+a);
}

catch(ArrayIndexOutOfBoundsException b)
{
System.out.println("ArrayIndexOutOfBoundsException Arised: "+b);
}

catch(Exception c)
{
System.out.println("Other Exception Arised: "+c);
}


}
}
