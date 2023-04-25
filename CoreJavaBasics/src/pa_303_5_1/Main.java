package pa_303_5_1;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		multiplicationTable();	
		
		gcd();
		
		tuitionPredict();
	}

	static void multiplicationTable() {
		System.out.println("**** Question #1 ****");
		int [][]mult = new int[12][12];
		for(int i=0; i< mult.length; i++) {
			for(int j=0; j<mult.length; j++) {
				mult[i][j] = (i+1) * (j+1);
				System.out.print(mult[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	static void gcd() {
		System.out.println("**** Question #2 ****");
		int gcd = 1;
		System.out.print("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2: ");
		int n2 = sc.nextInt();
        int smallest;
        if (n1 < n2)
            smallest = n1;
        else
            smallest = n2;

        for (int i = smallest; i > 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD: " + gcd);
	}
	
	static void tuitionPredict() {
		System.out.println("**** Question #3 ****");
		double tuition = 10000;
		int i = 1;
		while(tuition < 2*tuition) {
			tuition = 1.07*tuition;
			i++;
		}
		System.out.println("The tuition will double in " + i + " years.");
	}
	
}
