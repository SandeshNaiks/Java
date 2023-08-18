class Course
{
	int fees;
	String uname;
	String cname;
	Course(int fees,String uname,String cname)
	{
		this.fees=fees;
		this.uname=uname;
		this.cname=cname;
	}
	public String toString()
	{
		return this.fees+" "+uname+" "+cname;
	}
	public static void main(String[] args)
	{
		Course c1=new Course(69000,"VTU","BE");
		System.out.println(c1);
	}
}