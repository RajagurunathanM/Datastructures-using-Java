import java.util.*;

class TwoDArrayDemo
{
	static void print(int[][] a,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void add(int[][] a,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = a[i][j] + a[i][j];
			}
		}
	}
	static void mul(int[][] a,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = a[i][j] * a[i][j];
			}
		}
	}
	static int[][] transpose(int[][] a,int r,int c)
	{
		int[][] b = new int[c][r];
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[j][i] = a[i][j];
			}
		}
		
		return b;
				
	}
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		int r = x.nextInt();
		int c = x.nextInt();
		
		int[][] a = new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = x.nextInt();
			}
		}
		
		print(a,r,c);
		
		/*add(a,r,c);
		print(a,r,c);
		
		mul(a,r,c);
		print(a,r,c);*/
		
		a = transpose(a,r,c);
		print(a,r,c);
		
	}
}