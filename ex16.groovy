println "This is a game of Rock, Paper, Scissors. Player 1 should make a selection of either R, P or S at the start of each round.  Player 2 should then make their selection after Player 1.  Neither player should look at the screen before or during making their selections.  The winner is the player who has a lead of more than three points, at which time the game will terminate."
println "Player 1, enter your selection, followed directly by player 2 (with no spaces between): "
int Player1 = 0
int Player2 = 0
String s
while ((Player1 < (Player2 + 3)) && (Player2 < (Player1 + 3))) {
s = System.console().readLine()
	if (s.substring(0,1) == "P") {
		if (s.substring(1,2) == "P") {
		Player1++
		Player2++
		}
		else if (s.substring(1,2) == "R") {
		Player1++
		}
		else if (s.substring(1,2) == "S") {
		Player2++
		}
	}
	else if (s.substring(0,1) == "R") {
		if (s.substring(1,2) == "R") {
		Player1++
		Player2++
		}
		else if (s.substring(1,2) == "P") {
		Player2++
		}
		else if (s.substring(1,2) == "S") {
		Player1++
		}
	}
	else if (s.substring(0,1) == "S") {
		if (s.substring(1,2) == "S") {
		Player1++
		Player2++
		}
		else if (s.substring(1,2) == "P") {
		Player1++
		}
		else if (s.substring(1,2) == "R") {
		Player2++
		}
	}		
}
if (Player1 > Player2) {
	println "Player 1 wins with " + Player1 + " points to " + Player2 + "."
	}
else if (Player2 > Player1) {
	println "Player 2 wins with " + Player2 + " points to " + Player1 + "."
	}
	