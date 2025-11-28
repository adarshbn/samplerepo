package inheritance;

import accessmodifier.AccessOne;

public class AccessThree extends AccessOne{

	public static void main(String[] args) {


		AccessOne obj = new AccessOne();
		obj.display();
		
		AccessThree obj1 = new AccessThree();
		obj1.display3();

	}

}
