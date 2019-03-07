class CA1{
	public void run() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("Running: "+doc);	
		}
	}
}


// class MyTask extends MyFun, Thread{     //Error : Multiple Inheritans is not Supported
class MyWorks extends CA1 implements Runnable{
	@Override
	 public void run() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("^^ Child Thread Function is still Running: "+doc);	
		
		}
		
	}
}


public class ThreadDemo3 {

	public static void main(String[] args) {
		{
			System.out.println("==== Function is Started ====");
			
			Runnable r=new MyWorks();
			Thread t=new Thread(r);
			t.start();
			
			CA1 c=new CA1();
			c.run();
			
			for(int doc=1;doc<=10;doc++) {
				System.out.println("@@ Main Thread Function is still Running: "+doc);
			}
			
			System.out.println("==== Function is Ended ====");
			}

	}

}
