public class euler
{
	public static void main(String [] args)
	{	int i = 1;
		int j = 1;
		int k = 0;
		int [] sum = (fibs(i,j,k));
		System.out.println("\n" + sum[0]);
	}
	public static int [] fibs(int i, int j, int k)
	{	int [] sum = new int [1];
		while (k<3524578)
		{
			k = i + j;
			System.out.print(k + " ");
			i = k + j;
			System.out.print(i + " ");
			j = i + k;
			System.out.print(j + " ");
			sum[0] += k;
				
		}
		return sum;		
	}
}
