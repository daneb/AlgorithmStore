package codedtrue.com;

public class MergeSort {
	
	private int[] array;
	private int length;
	
	public void run_MergeSort()
	{
		int[] input_array = {14, 7, 3, 12, 9, 11, 6, 2};
		
		MergeSort ms = new MergeSort();
		ms.sort(input_array);
		
		for(int i = 0; i <= (input_array.length - 1); i++)
		{
			System.out.println(input_array[i]);
		}

	}
	
	public void sort(int input_array[]) {
		this.array = input_array;
		this.length = input_array.length;
		merge_sort(0, length - 1);
	}
	
	private void merge_sort(int p, int r)
	{
		
		// Base Case
		if (p < r)
		{
			// Divide
			int q = p + (r - p)/2;
			
			// Conquer
			// (a) First Half
			merge_sort(p, q);
		
			// (b) Second Half
			merge_sort(q + 1, r);
			
			// (c) Merge
		    merge(p, q, r);
			
		}
		
	}
	
	// Takes in array that has two sorted sub arrays
	// from [p..q] and [q+1..r], and merge the two
	private void merge(int p, int q, int r)
	{
		int low_length = q-p;
		int high_length = r-q;
		
		int[] lowHalf = new int[low_length];
		int[] highHalf = new int[high_length];
		
		int k = p;
		int i = 0;
		int j = 0;
		
		for(i = 0; k < q; i++, k++) {
			lowHalf[i] = array[k];
		}
		
		for(j = 0; k < r; j++, k++) {
			highHalf[j] = array[k];
		}
		
		// Don't forget to reset all to 0
		k = p;
		i = 0;
		j = 0;
		
		// Repeatedly compare the lowest un-taken element in
	    //  lowHalf with the lowest un-taken element in highHalf
	    //  and copy the lower of the two back into array
		while(i < low_length && j < high_length)
	    {
	        if(lowHalf[i] < highHalf[j]) {
	            array[k] = lowHalf[i];
	            i++; k++;
	        }
	        else {
	            array[k] = highHalf[j];
	            j++; k++;
	        }
	    }
		

	    // Once one of lowHalf and highHalf has been fully copied
	    //  back into array, copy the remaining elements from the
	    //  other temporary array back into the array
	    
	    while(i < lowHalf.length)
	    {
	        array[k] = lowHalf[i];
	        i++; k++;
	    }
	    
	    while(j < highHalf.length)
	    {
	        array[k] = highHalf[j];
	        j++; k++;
	    }
		
	}
}
