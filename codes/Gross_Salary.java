/*Basic = 10000.8989009
TA = 5600
DA = 14% of basic
Petrol allowance = 7000.3443534546
Tax deduction = 1.76% of DA*/


class Gross_Salary{
	public static void main(String args[])
	{
		double Basic = 10000.8989009f;
		float TA = 5600f;
		double DA,TaxD,Salary;
		DA = 0.14 * Basic;
		double PetrolA = 7000.3443534546f;
		TaxD= 0.0176 * DA;
		
		Salary = Basic + TA + DA + PetrolA - TaxD;
		
		System.out.println(" Basic= "+Basic);
		System.out.println(" TA = "+TA);
		System.out.println(" DA = "+DA);
		System.out.println(" Petrol Allowance = "+PetrolA);
		System.out.println(" Tax Deduction = "+TaxD);
		System.out.println(" Gross salary = "+Salary);
	}
	
}