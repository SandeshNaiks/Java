class Assign4
{
	public static void main(String[] args)
	{
		char ch='a';
		for(int i=1;i<=4;i++)
		{
			System.out.println(i+""+ch+""+(++ch)+""+(++i));
			i--;
			ch++;
		}
		}
}