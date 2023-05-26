package practice_SBA_303_14;

public class TestStaticMethod implements StaticMethods{

	public TestStaticMethod(){
		
	};
	
	public void methodTwo() {
		System.out.println("M");
	}
	public static void main(String[] args) {
		TestStaticMethod test = new TestStaticMethod();
		test.methodTwo();
		//Is it possible to to call methodOne from the class TestStaticMethod?
		//No, the instance of TestStaticMethod can only access methodTwo within the class
		//However, we can call methodOne from the interface as follow  
		StaticMethods.methodOne();
		
		//Why can’t you call methodOne from the TestStaticMethod?
		//We can't call it from the TestStaticMethod it is static and belongs to only the interface in which it was declared
 
	}
	

}
