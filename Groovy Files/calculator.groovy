println "Please enter two numbers: "
double firstNumber = Double.parseDouble(System.console().readLine())
double secondNumber = Double.parseDouble(System.console().readLine())
println "Now select an operation from the following menu: "
println "/ (Division)"
println "* (Multiplication)"
println "+ (Addition)"
println "- (Subtraction)"
double result
char operation = System.console().readLine()
if (operation == '/u002F') {
	result = firstNumber / secondNumber
	}
else if (operation == "*") {
	result = firstNumber * secondNumber
	}
else if (operation == "+") {
	result = firstNumber + secondNumber
	}
else if (operation == "-") {
	result = firstNumber - secondNumber
	}
println "The answer to " + firstNumber + " " + operation + " " + secondNumber + " is " + result + "."

//(/u002F) /
//(/u002A) *
//(/u002B) +
//(/u002D) -
