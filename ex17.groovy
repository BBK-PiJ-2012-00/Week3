println "This program takes a number and finds the nearest prime.  Please make your entry: "
int entry = Integer.parseInt(System.console().readLine())
int testLow = entry - 1
int testHigh = entry + 1
int primeLow, primeHigh
boolean isPrimeLow = false 
boolean isPrimeHigh = false
boolean finishedHigh = false
int divisor = 2
while (!isPrimeLow) {
	if (divisor == (testLow - 1)) {
		if (testLow % divisor == 0) {
		testLow--
		divisor = 2
		isPrimeLow = false
		}
		else if (testLow % divisor != 0) {
		divisor = 2
		isPrimeLow = true
		}
	}
	else if (divisor < testLow) {
		if (testLow % divisor == 0) {
		isPrimeLow = false
		testLow--
		divisor = 2
		}	
		else if (testLow % divisor != 0) {
		divisor++
		}
	}
}
//Successfully finds the nearest prime below the entry number.
while (!isPrimeHigh) {
	if (divisor == (testHigh - 1)) {
		if (testHigh % divisor == 0) {
		testHigh++
		divisor = 2
		isPrimeHigh = false
		}
		else if (testHigh % divisor != 0) {
		divisor = 2
		isPrimeHigh = true
		}
	}
	else if (divisor < testHigh) {
		if (testHigh % divisor == 0) {
		isPrimeHigh = false
		testHigh++
		divisor = 2
		}	
		else if (testHigh % divisor != 0) {
		divisor++
		}
	}
}
//Successfully finds the nearest prime above the entry number.
if ((entry - testLow) > (testHigh - entry)) {
	println testHigh
}
else if ((entry - testLow) < (testHigh - entry)) {
	println testLow
}
else if ((entry - testLow) == (testHigh - entry)){
	println testLow
	println testHigh
}
				