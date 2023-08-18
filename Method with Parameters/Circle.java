class Circle
{
	static void area(int r)
	{
	final double pi=3.142;
	double result=pi*r*r;
	System.out.println("The area of circle is "+result);
}
public static void main(String[] args)
{
	area(5);
	area(7);
	}
}