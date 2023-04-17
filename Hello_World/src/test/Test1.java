package test;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your full name: ");
		String name = sc.nextLine();
		System.out.println("Welcome " + name + "!");
		sc.close();
	}

}
