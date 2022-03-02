import java.util.*;

class practice
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fabo(i)+" ");
		}
	}

	public static int fabo(int n)
	{
		if(n<=1)
			return n;

		return (fabo(n-1)+fabo(n-2));
	}
}