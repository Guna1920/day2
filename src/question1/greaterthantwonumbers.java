package question1;

import java.util.Scanner;

public class greaterthantwonumbers {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		if (a>b) 
		System.out.println(a+" is greater than " +b);
		
		else if(a<b) {
			System.out.println(b+" is greater than " +a);

		}
		else if(a==b) {
			System.out.println(b+" is equal "+a);
		}
	}
}
