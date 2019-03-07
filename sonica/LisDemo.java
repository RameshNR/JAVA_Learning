import java.util.ArrayList;
public class LisDemo 
{
	public static void main(String arg[])
	{
		
		ArrayList list=new ArrayList();
		
		list.add("Sunita");
		list.add("Vinod");
		list.add("Rohit");
		list.add(100);
		list.add(200);
		list.add("Vinod");
		
		System.out.println(list);
		
		System.out.println("Size of List:"+list.size());
		
		list.remove(2); //Removing the element at the index 2.
		
		System.out.println(list);
		
		ArrayList list1=new ArrayList();
		
		list1.add("Fareed");
		list1.add("Rakesh");
		
		list.addAll(4,list1); //Adding list1 index to list.
		
		System.out.println("Size of the List:"+list.size());
		
		System.out.println(list);		
		
	}
}
