package hello;

import java.util.Arrays;

public class TripletSum {
	
public static int findTriplets(int[] arr, int n, int sum) 
{ 
	 int count=0;
     Arrays.sort(arr);
		for(int i=0; i<n-1; i++)
		{
         int j = i + 1;
         int k = n-1;
         while(j<k){
             
             
      if(arr[i]+arr[j]+arr[k] < sum)
                 j++;
          else if(arr[i]+arr[j]+arr[k] > sum)
                 k--;
      else
      {
          
          if(arr[j]==arr[k]){
              
           int m=k-j+1;   
              count+= (m*(m-1))/2; 
              System.out.println(count);
              break;
          }
   
          
       int start=j+1;    //2 3 3 3 3 4 4 5 5
       int  end=k-1;
         
     while(start<=end && arr[j]==arr[start])
     {
          start++;
     }    
       while(end>=start &&arr[k]==arr[end])
           end--;
          
         int f1= start-j;
          int f2=k-end;
          count+=f1*f2;
          System.out.println(count);
          
          j=start;
          k=end;
          
      }
            
     }
	}
		return count;
} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,3,3,3,4,4,5,5};
		int sum = 10;
        int arr_size = arr.length;
 
        int count =findTriplets(arr, arr_size, sum);
		System.out.println(count);

	}

}
