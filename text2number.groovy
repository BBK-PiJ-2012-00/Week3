println "This program reads a number with a commas and a decimal place and outputs half of it.  Please enter a number: "
String s = System.console().readLine()
int length = s.length() 
int charCount = 0
String number = ""
String decimal = ""
char c
boolean postDecimal = false
while (charCount < length) {
	if (!postDecimal) {
		c = s.charAt(charCount)
		charCount++
		if (c == '\u002C') {
		//do nothing
		}
		else if (c >= '\u0030') {
		number = number + c
		}
		else if (c == '\u002E') {
		postDecimal = true
		}
	}
	if (postDecimal) {
		c = s.charAt(charCount)
		charCount++
		decimal = decimal + c
	}
}
int decimalLength = decimal.length()
String finalNumber = number + decimal
int fNum  = Integer.parseInt(finalNumber)
if (fNum % 2 != 0) {
	fNum = fNum + 1
	fNum = fNum / 2
	double d = fNum - 0.5
	divisor = Math.pow(10,decimalLength)
	d = d / divisor
	println d
}
else {
	fNum = fNum / 2
	divisor = Math.pow(10,decimalLength)
	double d = fNum / divisor
	println d
}





//times by 10^(amount of decimal places) - this is effectively done when two strings containing number and decimal are put together, divide by 2, divide by 1^E(decimal places)