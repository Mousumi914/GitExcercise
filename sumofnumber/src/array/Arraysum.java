package array;
import java.util.Arrays;

public class Arraysum {
	
	public int sumofnumbers(int A[],int arr_size,int sum)
	{
	int l,r;
	Arrays.sort(A);    // sort the elements
	l=0;               //two candidates in the sorted array   
	r=arr_size - 1;
	while(l<r)
	{
		if(A[l] + A[r] == sum )
			return sum;
		else if (A[l] + A[r] < sum )
			l++;
		else             //A[l] +A[r]>sum
			r--;
	}
	return -1;
	}

}

