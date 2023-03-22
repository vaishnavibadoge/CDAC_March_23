/*To identify the grade of students
Input Total marks, percentage
Grade:  >95% --> Distinction
		>=85% --> First Class
		>=75% --> Second class
		<70% --> Average*/
import java.util.*;
class GradeOfStudent{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage of student: ");
		int percentage = sc.nextInt();
		if( percentage > 95 && percentage <= 100)
			System.out.println("Distinction"); 
		else if (percentage > 85 && percentage <= 95)
			System.out.println("First class");
		else if (percentage > 75 && percentage <= 85)
			System.out.println("Second class"); 
		else if(percentage < 70 && percentage <= 75)
			System.out.println("Average"); 
		else
			System.out.println("Invalid.");
		
	}
}