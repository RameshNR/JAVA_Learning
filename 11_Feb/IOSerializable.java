import java.io.*;

public class IOSerializable
{
public static void main(String arg[])
{
IOSerialDATABASE data=new IOSerialDATABASE();
data.name="SoniyaRamesh";
data.dob="27/12/1997";
data.relation="love";
data.process="not good";

try
{
FileOutputStream f=new FileOutputStream("c:\\Soniya\\11_Feb\\IOWriteData.txt");
String content="I'm Really Miss You Soniya";

for(int count=0; count<content.length();count++)
{
f.write(content.charAt(count));
}
System.out.println("Content Written to the File:");
f.close();

}
catch(Exception e)
{
System.out.println("Exception Arised:"+ e);
}

}
}