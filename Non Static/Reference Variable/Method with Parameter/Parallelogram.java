class Parallelogram
{
	void area(int b,int h)
	{
	int result=b*h;
	System.out.println("The area of parallelogram is "+result);
}
public static void main(String[] args)
{
	Parallelogram p=new Parallelogram();
	p.area(5,10);
	}
}