class Ellipse
{
	double area(int a,int b)
	{
	final double pi=3.142;
	double result=pi*a*b;
	return result;
}
public static void main(String[] args)
{
	Ellipse e=new Ellipse();
		double y=e.area(5,10);
		System.out.println(y);
	}
}