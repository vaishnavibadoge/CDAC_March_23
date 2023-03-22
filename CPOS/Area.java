class Area{
	double a,b;
	void CircleArea()
	{
		double area=3.14*a*a;
		System.out.println("Area of circle having radius "+a+" is "+area);
	}
	void TriangleArea()
	{
		double area=0.5*a*b;
		System.out.println("Area of triangle having base "+a+" and height "+b+" is "+area);
	}
	void SquareArea()
	{
		double area=a*a;
		System.out.println("Area of Square having side "+a+" is "+area);
	}
	void RectangleArea()
	{
		double area=a*b;
		System.out.println("Area of rectangle having length "+a+" and breadth "+b+" is "+area);
	}
	public static void main(String args[])
	{
		Area a1 = new Area();     //new area() will call constructor of class to make an obj of class inside heap area and assign the address of obj created to a1 class refe. variable.
		a1.a = 4;
		a1.CircleArea();// class ref. variable is also used to call the methods of the class for obj. data
		Area a2 = new Area();
		a2.a = 3;
		a2.b = 4;
		a2.TriangleArea();
		Area a3 = new Area();
		a3.a = 4;
		a3.SquareArea();
		Area a4 = new Area();
		a4.a = 3;
		a4.b = 4;
		a4.RectangleArea();
	}
}




/*

class c
var a.b.c

c1 = a
c2 =  a,b
c3 = a,b,c
*/