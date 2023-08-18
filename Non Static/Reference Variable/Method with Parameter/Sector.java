class Sector
{
	void area(int r,int t)
	{
	double result=0.5*r*r*t;
	System.out.println("The area of sector is "+result);
}
public static void main(String[] args)
{
	Sector s=new Sector(); 
	s.area(5,69);
	}
}