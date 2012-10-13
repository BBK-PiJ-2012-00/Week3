println "This is a simple command line calculator.  Please enter your query in the following format: x/y, x*y, x+y, or x-y: "
String s = System.console().readLine()
double firstNumber
double secondNumber
char operator, current
String first = ""
String second = ""
int length = s.length()
int charCount = 0
boolean operatorHasValue = false
while (charCount < length) {
	current = s.charAt(charCount)
	if (current >= '0') {
		if (!operatorHasValue) {
		first = first + current
		charCount++
		}
	}
	else if (current < '0') {
		operator = current 
		firstNumber = Double.parseDouble(first)
		current = s.charAt(charCount + 1)
		operatorHasValue = true
		charCount++ //moves the charCounter along one so that character after operator is not parsed twice.
	}
	if (operatorHasValue) {
		second = second + current 
		charCount++
	}
}
secondNumber = Double.parseDouble(second)
println firstNumber
println operator
println secondNumber
double result
if (operator == "/") {
	result = firstNumber / secondNumber
}
else if (operator == "*") {
	result = firstNumber * secondNumber
}
else if (operator == "+") {
	result = firstNumber + secondNumber
}
else if (operator == "-") {
	result = firstNumber - secondNumber
}
println "The result is: " + result
	
	
	