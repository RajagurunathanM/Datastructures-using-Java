import java.util.*;

class ArrayDemo
{
	static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static int[] copy(int[] a)
	{
		int[] cl = a.clone();
		
		return cl;
	}
	
	static void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	static int search(int[] a,int val)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == val)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	static int[] merge(int[] a,int[] b)
	{
		int[] m = new int[a.length+b.length];
		
		int i=0;
		
		for(i=0;i<a.length;i++)
		{
			m[i] = a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			m[i] = b[j];
			i++;
		}
		
		return m;
	}
		
	static void reverse(int[] a)
	{
		int s =0,e = a.length-1;
		
		while(s < e)
		{
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
	}
		
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = x.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = x.nextInt();
		}
		
		print(a);
		
		int[] cl = copy(a);
		
		print(cl);
		
		sort(a);
		
		print(a);
		
		System.out.println(search(a,100));
		
		int[] m = merge(a,cl);
		
		print(m);
		
		reverse(m);
		
		print(m);
		
		
	}
}
