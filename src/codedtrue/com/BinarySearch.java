package codedtrue.com;

public class BinarySearch {
	public static int doSearch(int[] array, int targetValue)
	{
		int min = 0;
		int max = array.length - 1;
		int guess = 0;
		
		while(min <= max) {
			guess = (int)Math.floor((max + min)/2);
			
			if(array[guess] == targetValue)
			{
				System.out.println("Total number of guesses" + guess);
				break;
			}
			else if (array[guess] < targetValue)
			{
				min = guess + 1;
			}
			else if(array[guess] > targetValue)
			{
				max = guess - 1;
			}
			
		}
		
		return guess;
		
		
	}
}
