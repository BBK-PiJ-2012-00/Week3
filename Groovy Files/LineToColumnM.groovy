println "Please enter some text: "
String s = System.console().readLine()
int inputLength = s.length()
int lineBreaker = 0
while (lineBreaker < inputLength) {
	char c = s.charAt(lineBreaker)
	if (c > '\u0020') {
	print c
	lineBreaker++
	}
	else if (c == '\u0020') {
	println c
	lineBreaker++
	}
}

