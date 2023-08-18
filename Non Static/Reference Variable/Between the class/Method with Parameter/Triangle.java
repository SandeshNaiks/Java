class Demo
{
	void area(int b,int h)
	{
	double result=0.5*b*h;
	System.out.println(result);
	}
}
class Triangle
{
public static void main(String[] args)
{
	Demo d=new Demo();
	d.area(30,5);
	}
}