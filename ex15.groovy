println "Try to guess my number!"
int guess
int counter = 0
int numberToGuess = Math.abs(1000 * Math.random())
boolean correct = false
boolean finished = false
while (!finished) {
println "Tell me a number: "
guess = Integer.parseInt(System.console().readLine())
	if (guess != numberToGuess) {
		correct = false
		if (guess < numberToGuess) {
		counter++
		println "No! My number is higher."
		}
		else if (guess > numberToGuess) {
		counter++
		println "No! My number is lower."
		}
	}
	else if (guess == numberToGuess) {
	counter++
	println "CORRECT! You needed " + counter + " guesses to beat me."
	finished = true
	}
}