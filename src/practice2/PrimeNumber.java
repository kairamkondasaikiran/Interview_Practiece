package practice2;

public class PrimeNumber {

	
	 public static void main(String[] args) {
	        int limit = 10; // Change this value to set your desired limit
	        System.out.println("Prime numbers up to " + limit + ":");
	        for (int i = 2; i <= limit; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
            	System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
