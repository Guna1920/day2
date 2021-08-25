package question4;
import java.util.Scanner;
public class fruit_seller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Cost Price");
		double cp = sc.nextDouble();
		System.out.println("Enter The Selling Price");
		double sp = sc.nextDouble();
			
		if (cp-sp>0)
		{
			System.out.println("loss:" +(cp-sp));
		}
		else if (cp-sp<0)
		{
			System.out.println("profit:" +(cp-sp));
		}
		else if (cp-sp==0) 
		{
			System.out.println("no loss and profit:" +(cp-sp));
		}
		}

	}