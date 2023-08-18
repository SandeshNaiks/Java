class Boolean
{
	public static void main(String[] args)
	{
		boolean[] arr=new boolean[5];
		arr[0]=true;
		arr[1]=false;
		arr[2]=false;
		arr[3]=true;
		arr[4]=true;
		System.out.println("values \t index");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" \t "+i);
		}
	}
}