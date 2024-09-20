package co.in.corejava;

public class PrimeNumber {
	
		
		public static void main(String[] args) {

			int n = 4;
			int p = 0;

			if (n > 1) {

				for (int i = 2; i <= n; i++) {
					if (n % i == 0) {

						if (n == i) {
							System.out.println(" prime ");
						} else {
							System.out.println(" not prime");
							break;
						}

					}

				}
			}
		}
	
		
		
		
		
	}
	
	

			


