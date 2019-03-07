package list;

import java.util.HashMap;
import java.util.Set;

public class MapDEMO {
public static void main(String arg[])
{
	HashMap<Integer,String> hashMap=new HashMap();
	hashMap.put(1234,"1234, NIVETHA,50000,APPLE");
	hashMap.put(null, "3457,asha,40000,mango");
	Set<Integer> keys=hashMap.keySet();
	for(Integer key:keys)
	{
		String EmpDetail= hashMap.get(key);
	    String emp[]=EmpDetail.split(",");
	    System.out.println("Employee Id:"+emp[0]);
		System.out.println("Employee Name:"+emp[1]);
		System.out.println("Employee Salary:"+emp[2]);
		System.out.println("Employee Address:"+emp[3]);
		
		
	}
		
	
	
}
}
