class Hybrid
{
	int x=69;
}
class Sample extends Hybrid
{
	int y=96;
}
class Tester extends Hybrid
{
	void disp()
	{
		System.out.println("Hybrid Class");
	}
}
class Demo extends Sample
{
	int z=41;
}
class Mainclass69
{
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		System.out.println(s1.x);
		System.out.println(s1.y);
		Tester t1=new Tester();
		t1.disp();
		Demo d1=new Demo();
		System.out.println(d1.z);
	}
}