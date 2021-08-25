package question2;

import java.util.Scanner;

public class character_is_alphabet_or_not {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a charactor");
		Scanner sc =new Scanner (System.in);
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch+ " is a vowels");
		}
		else if(ch>='a'&& ch<='z'){
			System.out.println( ch+" is a consonent");
		}
		else {
			System.out.println(ch+ " is not alphabet");
		}
	}

}