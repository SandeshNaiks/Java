class Circle
{
	double area(int r)
	{
	final double pi=3.142;
	double result=pi*r*r;
	return result;
}
public static void main(String[] args)
{
	Circle c=new Circle();
	double y=c.area(5);
	System.out.println(y);
	}
}