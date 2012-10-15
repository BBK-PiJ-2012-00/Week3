int getDecimalValue(String binaryStr) {
	int strLength = binaryStr.length();
	int counter;
	int powerCounter = 0;
	int decimalInt;
	int decimalValue = 0;
	String decimal = ""
	for (counter = strLength -1; counter >= 0; counter--) {
		String c = binaryStr.charAt(counter);
		int binaryChar = Integer.parseInt(c)
		int binaryMultiplier = Math.pow(2,powerCounter);
		powerCounter++;
			if (binaryChar == 0) {
			//do nothing
			}
			else {
			decimalInt = binaryChar * binaryMultiplier
			decimalValue = decimalValue + decimalInt
			}
		}
		return decimalValue;
}
int getBinaryValue(int decimalEntry) {
	int remainder;
	String binaryReverse = "";
	while (decimalEntry > 0) {
		remainder = decimalEntry % 2;
		decimalEntry = decimalEntry / 2;
		binaryReverse = binaryReverse + remainder;
	}
	char c;
	int bLength = binaryReverse.length();
	int counter = bLength;
	String binary = "";
	for (counter; counter > 0; counter--) {
		c = binaryReverse.charAt(counter-1);  
		binary = binary + c
	}
	int binaryValue = Integer.parseInt(binary);
	return binaryValue;
}
println "+----------------------------------+"
println "|           WELCOME TO             |"
println "|        BINARY TO DECIMAL         |"
println "+----------------------------------+"
println " "
println "This program converts binary numbers to decimal, and vice versa.  Please make a selection from the menu:"
println " "
println "--MENU--"
println "1: Binary to Decimal"
println "2: Decimal to Binary"
print ": "
int selection = Integer.parseInt(System.console().readLine())
if (selection == 1) {
	println "Please enter the binary number you wish to convert: "
	String binaryStr = System.console().readLine();
	int decimalValue = getDecimalValue(binaryStr);
	println "The binary value " + binaryStr + " is equal to: " + decimalValue;
} 
if (selection == 2) {
	println "Please enter the decimal number you wish to convert: "
	int decimalEntry = Integer.parseInt(System.console().readLine());
	int binaryValue = getBinaryValue(decimalEntry);
	println "The decimal value " + decimalEntry + " is equal to: " + binaryValue;
}


