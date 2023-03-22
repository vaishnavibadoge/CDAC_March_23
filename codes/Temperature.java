//convert temperatures in degrees Fahrenheit to Celsius

class Temperature{
	public static void main(String args[])
{
	float Fah, Celsius,temp1,temp2;  
          temp1= 13;  
          Fah =((temp1*9)/5)+32; 		  
          System.out.println("Temperature 13 degree celsius in Fah is: "+Fah);
		  temp2 = 56;
		  Celsius = (temp2-32)*5/9;
		  System.out.println("Temperature 56 Fah in Celsius is: "+Celsius);
		  
}
}