class School
{
	int strength;
	String name;
	char grade;
	School(int strength,String name,char grade)
	{
		this.strength=strength;
		this.name=name;
		this.grade=grade;
	}
	public String toString()
	{
		return this.strength+" "+name+" "+grade;
	}
	public static void main(String[] args)
	{
		School s1=new School(690,"DBIT",'A');
		System.out.println(s1);
	}
}