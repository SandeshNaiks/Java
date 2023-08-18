class Demo
{
	double area(int a,int b)
	{
	final double pi=3.142;
	double result=pi*a*b;
	return result;
	}
}
class Ellipse
{
public static void main(String[] args)
{
	Demo d=new Demo();
	double y=d.area(5,10);
	System.out.println(y);
	}
}