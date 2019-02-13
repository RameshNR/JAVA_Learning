
class MyWork extends Thread{
	@Override
	 public void run() {
		for(int doc=1; doc<=10; doc++) {
		System.out.println("^^ Child Thread Function is still Running: "+doc);	
		
		}
		
	}
}


public class ThreadDemo1 {

	public static void main(String[] args) {
		
				System.out.println("==== Function is Started ====");
				
				MyWork r=new MyWork();
				Thread t=new Thread(r);
				t.start();
		
				
				for(int doc=1;doc<=10;doc++) {
					System.out.println("@@ Main Thread Function is still Running: "+doc);
				}
				
				System.out.println("==== Function is Ended ====");
				}

		}
