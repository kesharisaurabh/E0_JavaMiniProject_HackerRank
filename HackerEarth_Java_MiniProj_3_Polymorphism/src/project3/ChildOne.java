package project3;

public class ChildOne extends Parent
{
		public String filter() 
		{
			int i=super.startElement;
	        int num = 0;
	        int maxCheck = super.endElement; 
	        boolean isPrime = true;	 
	        String primeNumbersFound = "";

	        for (; i <= maxCheck; i++) {
	            isPrime = CheckPrime(i);
	            if (isPrime) {
	                primeNumbersFound = primeNumbersFound + i + " ";
	            }
	        }	      
	        System.out.println(primeNumbersFound);
			return null;
		}
		public static boolean CheckPrime(int numberToCheck) {
	        int remainder;
	        for (int i = 2; i <= numberToCheck / 2; i++) {
	            remainder = numberToCheck % i;
	           
	            if (remainder == 0) {
	                return false;
	            }
	        }
	        return true;

	    }
}
