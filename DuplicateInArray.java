package hello;

public class DuplicateInArray {

	public static void duplicate(int[] arr)
	{
		int sum = 0,sum1 = ((arr.length - 1)*(arr.length))/2;
		
		for(int i = 0;i < arr.length;i++)
			sum += arr[i];
		
		System.out.println(sum1 - sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,3,1,5,4,3,2};
		duplicate1(arr);
		duplicate(arr);
	}

	private static void duplicate1(int[] arr) {
		// TODO Auto-generated method stub
		int count[] = new int[arr.length * 2];
		
		
		for(int i = 0;i < arr.length;i++)
		{
			count[arr[i]]++;
		}
		
		for(int i = 0;i < arr.length;i++)
		{
			if(count[arr[i]] == 2)
				System.out.println(arr[i]);
		}
	}

}
