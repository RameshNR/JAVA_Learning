class prox
{
	protected int x=10;
	public void main() {
	
		System.out.println("Haiiiii priya: "+x);
	
	}
}

class child extends prox
{
	
}

class ram extends prox
{
	public void sdemo()
	{
		int n=x+10;		
		System.out.println("ram: "+n);		
	}

}


class IODemo {

	public static void main(String[] args) {
		child c=new child();
		ram a=new ram();
		c.main();
		a.sdemo();
		c.x = 60;
	
		
	}

}
