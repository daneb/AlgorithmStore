package codedtrue.com;

public class Main {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] a = new int[]{14, 7, 3, 12, 9, 11, 6, 2};
		ms.sort(a);
		for(int i : a)
		{
			System.out.println(i);
		}
	}		
	
	public static void run_BinarySearch()
	{
		int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int targetValue = 73;
		int result = BinarySearch.doSearch(primes, targetValue);
		System.out.println("Did it work? "+ (result == 20));
	}
	

}
