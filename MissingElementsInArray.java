package week1.day2.Assignments2;

import java.util.Arrays;

public class MissingElementsInArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);			// array sorted
		int length=arr.length;		// array length stored in length
		int i=arr[0];
		while(i<=length)
		{
			if(i!=arr[i-1])			// ex : arr[i-1] -> i indicates the index of array
			{
				System.out.print(i);
				break;
			}
			i++;				
		}
	}
}
