class Ellipse
{
	void area()
	{
	final double pi=3.142;
	int a=5;
	int b=10;
	double result=pi*a*b;
	System.out.println("The area of ellipse is "+result);
}
public static void main(String[] args)
{
	Ellipse e=new Ellipse();
		e.area();
	}
}