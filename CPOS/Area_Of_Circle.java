class Area_Of_Circle{
	float pi = 3.14f;
	float radius;
	void Area()
	{
		float area=pi*radius*radius;
		System.out.println("Area of circle having radius "+radius+" is "+area);
	}
	public static void main(String args[])
	{
		Area_Of_Circle c1 = new Area_Of_Circle();
		c1.radius = 4;
		c1.Area();
	}
}