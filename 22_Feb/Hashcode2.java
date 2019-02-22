
public class Hashcode2 {

	public static void main(String[] args) {
		String d=new String("Ram");
		System.out.println(d.hashCode());
		d=d.concat("Raj");
		System.out.println(d.hashCode());
		System.out.println(d);	
	}
	}
