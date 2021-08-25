package question16;
import java.util.Scanner;
import java.math.*;
import java.lang.*;
public class Circle_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X,Y,Z,x,y,z;
		System.out.println("Enter The First X ");
		X = sc.nextInt();
		System.out.println("Enter The First Y ");
		Y = sc.nextInt();
		System.out.println("Enter The First Z ");
		Z = sc.nextInt();
		System.out.println("Enter The second x ");
		x = sc.nextInt();
		System.out.println("Enter The second y ");
		y = sc.nextInt();
		System.out.println("Enter The second z ");
		z = sc.nextInt();
		
		int rad = Z+z;
		double Fee = Math.pow(X-x, 2)+Math.pow(Y-y, 2);
		double  R  = Math.sqrt(Fee);
		
	if ( rad > R ) 
	{
		System.out.println("Circle Over Lap");
	}
	else if ( rad == R ) 
	{
		System.out.println("Circle Are Tangential ");
	}
	else if ( rad <= R) {
	    System.out.println("Circle Don't Over Lap")  ;
	}
	
	}

}
