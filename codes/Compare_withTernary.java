/*Input: Num1 and Num2
If Num1 > then do Num1+Num2
If Num2 > then do Num1-Num2*/
import java.util.*;
class Compare_withTernary{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int ans = (num1>num2)?num1+num2:num1-num2;
		System.out.println("Ans: "+ans);
		
	}
}