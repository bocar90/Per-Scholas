package extra_labs;

public class GenericClassLAB2<T extends Number> {

	public void display() {
		System.out.println("This is a bounded type generic class.");
	}
	
	public static void main(String[] args) {
		// create an object of GenericsClass
		//GenericClassLAB2<String> obj =  new GenericClassLAB2<>();
		//we need to change String to a subclass of Number such as Integer
		GenericClassLAB2<Integer> obj =  new GenericClassLAB2<>();
		obj.display();

	}

}
