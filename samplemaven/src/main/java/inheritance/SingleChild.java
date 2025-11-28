package inheritance;

public class SingleChild extends SingleParent {
	
	public void sum()
	{
		int x= 10;
		int y = 20;
		int z = x+y;
		System.out.println("The sum is : "+z);
	}

	public static void main(String[] args) {
		
		SingleChild obj = new SingleChild();
		obj.sum();
		obj.display();
		obj.product();
	}

}
