import java.io.*;
class IODemo1
{
public static void main(String arg[])
{

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
