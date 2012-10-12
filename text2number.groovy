println "This program reads a number with a commas and a decimal place and outputs half of it.  Please enter a number: "
String s = System.console().readLine()
int length = s.length() 
int charCount = 0
String number = ""
char c
while (charCount < length) {
	c = s.charAt(charCount)
	charCount++
		if (c < '\u0030') {
		//do nothing
		}
		else if (c >= '\u0030') {
		number = number + c
		}
}
int i = Integer.parseInt(number)
println i