class CA{
	public void run() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("CA is Running: "+doc);	
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

// you won't include the extends CA, 
//because it's already included in the the MyWork Thread 
// by using the Runnable on the main method
class MyWork2 implements Runnable{
	@Override
	 public void run() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("^^ I'm Child Thread 2: "+doc);	
		
		}
		
	}
}


public class ThreadDemo4 {

	public static void main(String[] args) {
		
				System.out.println("==== Function is Started ====");
				
				Runnable r=new MyWork();
				Thread t=new Thread(r);
				t.start();
			
				
				
				//Thread t2=new Thread(new MyWork2());
				//t2.start();
				
    //you wont create new Runnable, because Runnable is already created
	// if you won't reference for the MyWork2 
    // you can directly Access the thread 
				
				
				// it is 2nd Child Thread for the 1st Child Thread
				new Thread(new MyWork2()).start();
				
				
				
				// it's not a Thread 
				CA c=new CA();
				c.run();
				
				
				
				for(int doc=1;doc<=10;doc++) {
					System.out.println("@@ Main Thread Function is still Running: "+doc);
				}
				
				System.out.println("==== Function is Ended ====");
				}

		}
