class Ellipse
{
	void area(int a,int b)
	{
	final double pi=3.142;
	double result=pi*a*b;
	System.out.println("The area of ellipse is "+result);
}
public static void main(String[] args)
{
	Ellipse e=new Ellipse();
		e.area(5,10);
	}
}