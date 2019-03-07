import java.io.*;
public class Demo {

	public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("c:\\Soniya\\Raj.txt");
		String data="im really miss you my dear Jayapriya";
		byte b[]=data.getBytes();
		f.write(b);
		System.out.println("Data writen");
		f.close();
		}
catch(Exception e) {
	System.out.println("Exception Ariced: "+ e);
}
	
	
	try {
		FileInputStream g=new FileInputStream("c:\\Soniya\\Raj.txt");
		int i=0;
		while((i=g.read()) !=-1) {
			System.out.print((char)i);
			}
		System.out.println("\nData is readed");
		g.close();
	}
		catch(Exception e){
			System.out.println("Exception Ariced: "+e);
		}
	
	}

}
