class Circle
{
	void area(int r)
	{
	final double pi=3.142;
	double result=pi*r*r;
	System.out.println("The area of circle is "+result);
}
public static void main(String[] args)
{
	Circle c=new Circle();
	c.area(5);
	}
}