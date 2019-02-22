class Student1{
	int roll;
	String name;
	
		public Student1(int roll, String name) {
		//super();
		this.roll = roll;
		this.name = name;
	}
}

public class HashCode {

	public static void main(String[] args) {
		Student1 d=new Student1(10,"Ram");
		System.out.println(d);
		}
	}
