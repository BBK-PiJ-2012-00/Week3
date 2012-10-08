println "This program lists all the primes numbers from 1 to 1000: "
println "1"
println "2"
int test = 3
int divisor = 2
boolean isPrime = true
while (test < 1000) {
	if (divisor == (test - 1)) {
		if (test % divisor == 0) {
			isPrime = false
			test = test + 2
			divisor = 2
		}
		else if (test % divisor != 0) {
			isPrime = true
		}
		if (isPrime) {
		println test
		test = test + 2
		divisor = 2
		}
	}
	else if (divisor < test) {
		if (test % divisor == 0) {
		isPrime = false 
		test = test + 2
		divisor = 2
		}
		else if (test % divisor != 0) {
		divisor++			
		isPrime = false
		}
	}
	




}
	
