package inheritance;

public class HierarchialChild2 extends HierarchialParent{
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum: "+c);
	}

	public static void main(String[] args) {
		
		HierarchialChild2 obj = new HierarchialChild2();
		obj.print();
		obj.sum(5, 6);

	}

}
