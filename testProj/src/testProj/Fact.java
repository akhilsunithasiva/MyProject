package testProj;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number for Factorial : ");
		int a = input.nextInt();
		int fact=1;
		for(int i = 1; i<=a; i++) {
			fact *= i;
		}
		System.out.print("Factorial : "+fact);
		System.out.println();
		System.out.print("Enter a Number for Sum of n Numbers : ");
		int b = input.nextInt();
		int sum = 0;
		for( int i = 1; i<=b; i++) {
			sum += i;
		}
		System.out.print("Sum of "+a+" Numbers is : "+sum);
		
		System.out.print("Enter a Number : ");
		int x = input.nextInt();
		int t = b/x;
		
		input.close();

	}
}
