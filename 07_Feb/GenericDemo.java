import java.util.*;
public class GenericDemo
{
public static void main(String arg[])
{

ArrayList<String> list=new ArrayList<String>();
list.add("Ramesh");
list.add("Soniya");
list.add("Jaya");
list.add("Priya");

System.out.println(list);

//Integer intr=(Integer)list.get(1);
//System.out.println(" value: "+intr);


String str=(String)list.get(1);
System.out.println(" value: "+str);
}
}