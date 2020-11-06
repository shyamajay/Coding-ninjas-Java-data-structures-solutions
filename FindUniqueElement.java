package hello;

import java.util.Arrays;

public class FindUniqueElement {

	
	public static void unique1(int[]arr)
	{
		int count[] = new int[arr.length * 2];
		
		for(int i = 0;i < arr.length;i++)
		{
			count[arr[i]]++;
		}
				
		for(int i = 0;i < arr.length;i++)
		{
			if(count[arr[i]] == 1)
				System.out.println(arr[i]);
		}
	}

	public static int unique(int[]arr)
	{
		Arrays.sort(arr);
		for(int i = 0; i+1 < arr.length;i=i+2)
		{
			if(arr[i] == arr[i+1])
				continue;
			else
			{
				return arr[i];
			}
		}
		
			return arr[arr.length-1];
		
	}
	
	public static void unique3(int[]arr)
	{
		int sum = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length;i++)
		{
			sum ^= arr[i];
		}
		
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,1,6,3,4,4,3,1,10};
		unique1(arr);
		unique3(arr);
		int res = unique(arr);
		System.out.println(res);
	
	}

}
