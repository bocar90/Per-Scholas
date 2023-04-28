package pa_303_10_3;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser child = new KidUser();
		child.setAge(10);
		child.registerAccount();
		child.setBookType("Kids");
		child.requestBook();
		
		child.setAge(18);
		child.registerAccount();
		child.setBookType("Fiction");
		child.requestBook();
		
		AdultUser adult =  new AdultUser();
		adult.setAge(5);
		adult.registerAccount();
		adult.setBookType("Kids");
		adult.requestBook();
		
		adult.setAge(23);
		adult.registerAccount();
		adult.setBookType("Fiction");
		adult.requestBook();
		
	}

}
