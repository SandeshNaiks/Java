class Demo
{
	static double area()
	{
	int r=5;
	double t=61.5;
	double result=0.5*r*r*t;
	return result;
	}
}
class Sector
{
public static void main(String[] args)
{
	double y=Demo.area();
	System.out.println(y);
	}
}