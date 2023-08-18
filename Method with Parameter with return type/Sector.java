class Sector
{
	static double area()
	{
	int r=5;
	double t=61.5;
	double result=0.5*r*r*t;
	return result;
}
public static void main(String[] args)
{
	double y=area();
	System.out.println(y);
	}
}