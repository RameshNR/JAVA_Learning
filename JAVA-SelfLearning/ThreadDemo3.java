class CA{
	public void run() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("Running: "+doc);	
		}
	}
}


// class MyTask extends MyFun, Thread{     //Error : Multiple Inheritans is not Supported
class MyWork extends CA implements Runnable{
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
			
			Runnable r=new MyWork();
			Thread t=new Thread(r);
			t.start();
			
			CA c=new CA();
			c.run();
			
			for(int doc=1;doc<=10;doc++) {
				System.out.println("@@ Main Thread Function is still Running: "+doc);
			}
			
			System.out.println("==== Function is Ended ====");
			}

	}

}
