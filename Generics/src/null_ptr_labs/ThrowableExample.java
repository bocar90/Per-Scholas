package null_ptr_labs;

public class ThrowableExample {

	public static void main(String[] args) throws Exception{
		try {
            testException();
        } catch (Throwable e) {
            // Print using tostring()
            System.out.println("Exception: " + e.toString());
        }
    }

    // Method which throws Exception
    public static void testException() throws Exception {

       throw new Exception("Exception thrown"); 

	}
}
