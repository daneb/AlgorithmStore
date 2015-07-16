package codedtrue.com;

public class Main {

	public static void main(String[] args) {
		run_BinarySearch();
	}		
	
	public static void run_BinarySearch()
	{
		int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int targetValue = 73;
		int result = BinarySearch.doSearch(primes, targetValue);
		System.out.println("Did it work? "+ (result == 20));
	}

}
