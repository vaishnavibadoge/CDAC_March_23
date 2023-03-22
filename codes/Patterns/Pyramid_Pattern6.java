class Pyramid_Pattern6{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			for(int k=1;k<=9-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}