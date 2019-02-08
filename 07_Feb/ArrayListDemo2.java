import java.util.*;
public class ArrayListDemo2
{
public static void main(String arg[])
{
//Creating Array list
ArrayList list=new ArrayList();
list.add("Ramesh");
list.add("Soniya");
list.add("Jaya");
list.add("Priya");
list.add("Pooja");
System.out.println(list);

//Remove value by using Index value
list.remove(2);
System.out.println("Index 2 value will be removed: "+list);

//Remove value by using value
list.remove("Pooja");
System.out.println("Value Pooja will be removed: "+list);

//Size of array list
System.out.println("Size of ArrayList: "+list.size());


//creating Sub List

ArrayList sublist=new ArrayList();
sublist.add("Jaya");
sublist.add("Pooja");

//add all sublist data to Main list(Array List)
list.addAll(sublist);
System.out.println("Sublist value: "+sublist);

System.out.println("After Sublist Will be added: "+list);
System.out.println("size of After Sublist Will be added: "+list.size());


//Find or Searching value's

if(list.contains("Pooja"))
{
System.out.println("Pooja is Available");
}

else
{
System.out.println("Pooja is not Available");
}

}
}