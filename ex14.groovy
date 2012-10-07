println "This program lists the first 1000 prime numbers: "
println "1"
println "2"
int counter = 2
int test = 3
int divisor = 2
boolean isPrime = true
while (counter <= 1000) {
	if (divisor == (test - 1)) {
		if (test % divisor == 0) {
			isPrime = false
			test = test + 2
			divisor = 2
		}
		else if (test % divisor != 0) {
			isPrime = true
			counter++
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

//only want to add to counter in event that prime is recognised as true, not for every time a numer enters loop
	
