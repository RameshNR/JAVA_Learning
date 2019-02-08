import java.util.*;
public class NonGenericDemo
{
public static void main(String arg[])
{

ArrayList list=new ArrayList();
list.add("Ramesh");
list.add("Soniya");
list.add("Jaya");
list.add("Priya");

System.out.println(list);

Integer intr=(Integer)list.get(1);
System.out.println(" value: "+intr);


}
}