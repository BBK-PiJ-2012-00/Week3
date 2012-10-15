println "Please enter some text: "
String s = System.console().readLine()
int inputLength = s.length()
int lineBreaker
for (lineBreaker = 0; lineBreaker <= inputLength; lineBreaker++) {
	char c = s.charAt(lineBreaker)
	println c
}





