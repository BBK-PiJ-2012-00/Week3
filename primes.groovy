println "Please enter a number to see whether or not it is a prime: "
String s = System.console().readLine()
int i = Integer.parseInt(s)
boolean isPrime = true
int divisor = 3
if (i == 2) {
	isPrime = true
}
else if (i % 2 == 0) {
	isPrime = false
}                                 // Rules out 2, and all even numbers.
else while (divisor < i) {
	if (i % divisor == 0) {
	isPrime = false
	break;
	}
	else if (i % divisor != 0) {
	divisor = divisor + 2
	}                        // Tests odd numbers up to the value of i, breaking as soon as a divisor is found.
}
if (isPrime) {
	println i + " is a prime number."
}
else { 
	println i + " is not a prime number."
}

