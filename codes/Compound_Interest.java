/*Loan Amt = 5Cr.
No. of yrs = 5
Investment = 11.56Cr
Rate od interest = 10.75%*/
class Compound_Interest{
	public static void main(String args[])
{
	long Principal = 50000000l;
	int years = 5;
	double RateOfI = 10.75f;
	double Compound_Int,Amount;
	
	Amount=Principal*((1+RateOfI/100)*(1+RateOfI/100)*(1+RateOfI/100)*(1+RateOfI/100)*(1+RateOfI/100));
	
	Compound_Int = Amount - Principal;
	System.out.println(" Principal = "+Principal);
	System.out.println(" For Time period of  = "+years+ " yrs");
	System.out.println(" With Rate of Interest = "+RateOfI+"%");
	System.out.println(" Amount = "+Amount);
	System.out.println(" Compound Interest = "+Compound_Int);
	
}
}
