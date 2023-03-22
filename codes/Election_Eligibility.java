//To Identify the eligibility of a voter for upcoming election
import java.util.*;
class Election_Eligibility{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of candidate: ");
		String s1 = "Indian";
		String s2 = "INDIAN";
		String s3 = "indian";
		float age = sc.nextFloat();
		if(age >=18.00)
		{
			System.out.println("Enter the nationality of candidate: ");
			String nationality = sc.next();
			if((nationality.equals(s1)) || (nationality.equals(s2)) || (nationality.equals(s3)))
			{
				System.out.println("Do you have voter id: ");
				System.out.println("Note: please enter 1 for yes or 0 for No");
				int ans = sc.nextInt();
				if(ans == 1)
					System.out.println("Candidate is eligible for voting!");
				else
					System.out.println("Opps! Candidate is not eligible for voting.");
			}
			else
				System.out.println("Opps! Candidate is not eligible for voting.");
			
		}
		else
			System.out.println("Opps! Candidate is not eligible for voting.");
	}
} 