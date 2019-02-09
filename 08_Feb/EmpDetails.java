import java.util.*;
public class EmpDetails
{
public static void main(String arg[])
{
HashMap<Integer,String> emp=new HashMap<Integer,String>();

emp.put(01,"01: Ramesh: ECE: UCET");
emp.put(02,"02: Soniya: ECE: UCET");
emp.put(03,"03: Priya: ECE: UCET");
emp.put(04,"04: Shanmugam: ECE: UCET");

Set<Integer> empIDS=emp.keySet();
for(Integer empID:empIDS)
{
String rec=emp.get(empID);
String del[]=rec.split(":");

System.out.println("============Emp Del============");

System.out.println("Emp ID: "+del[0]);
System.out.println("Emp Name: "+del[1]);
System.out.println("Emp Dept: "+del[2]);
System.out.println("Emp Clg: "+del[3]);

}

}
}