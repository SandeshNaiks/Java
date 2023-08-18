class Demo
{
	double area(int r)
	{
	final double pi=3.142;
	double result=pi*r*r;
	return result;
	}
}
class Circle
{
public static void main(String[] args)
{
	Demo d=new Demo();
	double y=d.area(5);
	System.out.println(y);
	}
}