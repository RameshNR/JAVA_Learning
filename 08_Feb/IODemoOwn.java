import java.io.*;
class IODemoOwn
{
public static void main(String arg[])
{

try
{
FileOutputStream f=new FileOutputStream("Ram.java");

String data="class Ram { public static void main(String arg[])  {  System.out.println( \" PriyaGanesh earuma\" );   }   }";

byte b[]=data.getBytes();
f.write(b);
System.out.println("Data is writed on File");
f.close();
}

catch(Exception e)
{
System.out.println("Excetion Arised"+e);
}

try
{
FileInputStream f=new FileInputStream("Ram.java");
int i=0;
while((i=f.read()) !=-1)
{
System.out.print((char)i);
}
}

catch(Exception e)
{
System.out.println("Excetion Arised"+e);
}

}
}
