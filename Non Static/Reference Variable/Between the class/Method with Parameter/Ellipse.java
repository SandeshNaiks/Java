class Demo
{
	void area(int a,int b)
	{
	final double pi=3.142;
	double result=pi*a*b;
	System.out.println(result);
	}
}
class Ellipse
{
public static void main(String[] args)
{
	Demo d=new Demo();
	d.area(5,10);
	}
}