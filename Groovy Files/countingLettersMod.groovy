println "Please enter some text: "
String s = System.console().readLine()
println "Now choose a letter you would like to count: "
char choice = System.console().readLine()
int inputLength = s.length()
int charCounter = 0
int eCount = 0
while (charCounter < inputLength) {
	char c = s.charAt(charCounter)
	if (c == choice) {
	eCount++
	charCounter++
	}
	else {
	charCounter++
	}
}
println "You entered the letter " + choice + " " + eCount + " times."