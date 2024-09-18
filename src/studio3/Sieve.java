package studio3;

public class Sieve {

	public static void main(String[] args) {
		
		int n = 30;
		boolean[] primes = new boolean [n];
				
		
		for (int i = 0; i < n; i++) { 
			primes[i] = true; 
		}
		
		for (int i = 2; i < n;  i++) { 
			
			if (primes [i] == true) {
			for ( int j = i * i; j < n; j += i ) {
				primes[j] = false;	
			}
			}
			
		}
		
		for ( int i = 0; i < n; i++) {
			
			if (primes[i] == true){
				
			System.out.println(i);
		}
			
		}
	}
	
}
		
		
		
