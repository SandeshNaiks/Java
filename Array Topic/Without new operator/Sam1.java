import java.util.Scanner;
class Sam1 
{
	static void check(int no)
	{
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println("reverse of the number is :"+rev);
		if(rev==copy)
		{
			System.out.println("the number is pllindrome");
		}
		else
			{
			System.out.println("not paindrome ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a number");
		int no=scr.nextInt();
		check(no);
	}
}
