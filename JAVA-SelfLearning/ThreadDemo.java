/*class MyTask extends Thread{
	 void extask() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("Child Function is still Running: "+doc);	
		}
	}
}

*/
class MyTask extends Thread{
	@Override
	 public void run() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("^^ Child Thread Function is still Running: "+doc);	
		}
	}
}



public class ThreadDemo {

	public static void main(String[] args) 
	{
	System.out.println("==== Function is Started ====");
	
	MyTask t=new MyTask();
	//t.extask();
	t.start(); // Calling thread
	
	for(int doc=1;doc<=10;doc++) {
		System.out.println("@@ Main Thread Function is still Running: "+doc);
	}
	
	System.out.println("==== Function is Ended ====");
	}

}
