class Student{
	int roll;
	String name;
	
		public Student(int roll, String name) {
		//super();
		this.roll = roll;
		this.name = name;
	}
		
		public String toString() {
			return "Roll.NO: "+    roll   +"\n"+ "Name: "+     name;
		}
	
}

public class ToString {

	public static void main(String[] args) {
		Student d=new Student(10,"Ram");
		System.out.println(d);
		}
	}
