println "Please enter some text: "
String s = System.console().readLine()
int inputLength = s.length()
int charCounter = 0
int eCount = 0
while (charCounter < inputLength) {
	char c = s.charAt(charCounter)
	if ((c == '\u0065') || (c == '\u0045')) {
	eCount++
	charCounter++
	}
	else {
	charCounter++
	}
}
println "You entered the letter 'e' " + eCount + " times."
	
	
	
	