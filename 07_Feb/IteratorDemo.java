import java.util.*;
public class IteratorDemo
{
public static void main(String arg[])
{

ArrayList list=new ArrayList();
list.add("Ramesh");
list.add("Soniya");
list.add(100);
list.add("Jaya");
list.add("Priya");

System.out.println(list);

Iterator itr=list.iterator();
while(itr.hasNext());
{
Object element=itr.next();

if(element instanceof String)
{
String str=(String)element;
System.out.println(str+" -String");

if(str.equals("Jaya"))
itr.remove();

}


else if(element instanceof Integer)
{
Integer intr=(Integer)element;
System.out.println(intr+" -Integer");
}

}
System.out.println("List Collection Element: "+list);


}
}