class Area
{
int a=20;
int b=3;
void square()
{
int c=a*a;
System.out.println("Area of square"+c);
}
void triangle()
{
System.out.println(a);
int d=(a*b)/2;
System.out.println("Area of triangle"+d);
}
public static void main(String args[])
{
Area obj=new Area();
obj.square();
obj.triangle();
}
} 