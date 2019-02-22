
public class MutableString {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		sb1.append("Suresh "+ 78);
		sb1.append(" Kumar");
		System.out.println("String Buffer : "+sb1);
		
		StringBuilder sb2=new StringBuilder();
		sb2.append("Suresh");
		sb2.append("Kumar");
		System.out.println("String Builder : "+sb2);

	}

}
