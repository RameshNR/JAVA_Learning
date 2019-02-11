import java.io.*;
class IODemo2
{
public static void main(String arg[])
{
try
{
FileOutputStream f=new FileOutputStream("Ram.java");

String data="class Ram { public static void main(String arg[])  {  System.out.println( \" PriyaGanesh \" );   }   }";

byte b[]=data.getBytes();
f.write(b);
System.out.println("Data is writed on File");
f.close();
}

catch(Exception e)
{
System.out.println("Excetion Arised"+e);
}

}
}
