package runtime;

public class PrimeCheck {
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		int s = (int) Math.ceil(Math.sqrt(n));
		for(int i=2; i<=s; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(5));
	}
}
