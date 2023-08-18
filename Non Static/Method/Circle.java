class Circle
{
	void area()
	{
	final double pi=3.142;
	int r=5;
	double result=pi*r*r;
	System.out.println("The area of circle is "+result);
}
public static void main(String[] args)
{
	new Circle().area();
	}
}