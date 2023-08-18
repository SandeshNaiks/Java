class Double
{
	public static void main(String[] args)
	{
		double[] arr=new double[5];
		arr[0]=69.1;
		arr[1]=69.2;
		arr[2]=69.3;
		arr[3]=69.4;
		arr[4]=69.5;
		System.out.println("values \t index");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" \t "+i);
		}
	}
}