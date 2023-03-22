//Make use of ternary operator and identify the even number
import java.util.*;
class Even_withTernary{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		//String ans = (num % 2 == 0)?"Even":"Odd";
		//System.out.println("Number is "+ans);
		String ans = (num % 2 == 0)?System.out.println("Number is Even"):System.out.println("Number is Odd");;

	
	}
		
			
}