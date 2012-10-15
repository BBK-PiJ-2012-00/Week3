println "This program creates a palindrome out of the text you enter: "
String entry = System.console().readLine()
int entryLength = entry.length()
int charCount = entryLength
String reverse = ""
while (charCount > 0) {
	char c = entry.charAt(charCount-1)
	reverse = reverse + c
	charCount--
}
println entry + reverse