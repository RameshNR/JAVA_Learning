import java.util.*;
public class EnhancedForLoop
{
public static void main(String arg[])
{

ArrayList list=new ArrayList();
list.add("Ramesh");
list.add("Soniya");
list.add(900);
list.add(54.9);
list.add('P');
list.add(14.9f);

System.out.println(list);

for(Object element:list)
{

//Finding String Value
if(element instanceof String)
{
String str=(String)element;
System.out.println(str+" -String");
}

//Finding Integer Value
else if(element instanceof Integer)
{
Integer intr=(Integer)element;
System.out.println(intr+" -Integer"); 
}

//Finding Character Value
else if(element instanceof Character)
{
Character cha=(Character)element;
System.out.println(cha+" -Character"); 
}

//Finding Double Value
else if(element instanceof Double)
{
Double dob=(Double)element;
System.out.println(dob+" -Double"); 
}

//Finding Float Value
else if(element instanceof Float)
{
Float flo=(Float)element;
System.out.println(flo+" -Float"); 
}

}

}
}