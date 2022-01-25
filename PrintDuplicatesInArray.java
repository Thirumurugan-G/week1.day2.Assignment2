package week1.day2.Assignments2;

public class PrintDuplicatesInArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length=arr.length;
		int count;
		for(count =0;count <= length-1;count++)
		{
			for(int i=count+1;i<length;i++)
			{
				if(arr[i]==arr[count])
				{
					System.out.println(arr[count]);
				}
			}
		}
	}
}
