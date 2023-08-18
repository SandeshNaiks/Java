class Eployee
{
	int id;
	double sal;
	char grade;
	Eployee(int id,double sale,char grade)
	{
		this.id=id;
		this.sal=sal;
		this.grade=grade;
	}
	public String toString()
	{
		return this.id+" "+sal+" "+grade;
	}
	public static void main(String[] args)
	{
		Eployee e1=new Eployee(6969,690000,'A');
		System.out.println(e1);
	}
}