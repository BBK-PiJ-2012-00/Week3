//Program rejects invalid ranks, suits, as is defined in the entry phase below.
println "Enter five cards and their respective suits to determine the best poker hand.  For example, King of Hearts would be input as: K Hearts. Ace of Diamonds: 1 Diamonds (suits begin with capital letters): "
int counter = 0
int rank1, rank2, rank3, rank4, rank5
String a, sub, suit1, suit2, suit3, suit4, suit5
if (counter == 0) {
a = System.console().readLine()
	if (a.substring(0,1) == "K") {
		rank1 = 13
		suit1 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "Q") {
			rank1 = 12
			suit1 = a.substring(2)
			counter++
	}
	else if (a.substring(0,1) == "J") {
		rank1 = 11
		suit1 = a.substring(2)
		counter++
	}
	else if ((a.substring(0,1) == "1") && (a.substring(1,2) == "0")) {
		rank1 = 10
		suit1 = a.substring(3)
		counter++
	}
	else {
	sub = a.substring(0,1)
	rank1 = Integer.parseInt(sub)
	suit1 = a.substring(2)
	counter++
	}
	if ((rank1 <= 0) || (rank1 > 13)) {
		println "Invalid rank.  Press ctrl-c to cancel and start again."
	}
	else if ((suit1 != "Hearts") && (suit1 != "Diamonds") && (suit1 != "Clubs") && (suit1 != "Spades")) {
		println "Invalid suit.  Press ctrl-c to cancel and start again."
	}
}
if (counter == 1) {
	a = System.console().readLine()
	if (a.substring(0,1) == "K") {
		rank2 = 13
		suit2 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "Q") {
		rank2 = 12
		suit2 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "J") {
		rank2 = 11
		suit2 = a.substring(2)
		counter++
	}
	else if ((a.substring(0,1) == "1") && (a.substring(1,2) == "0")) {
		rank2 = 10
		suit2 = a.substring(3)
		counter++
	}
	else {
		sub = a.substring(0,1)
		rank2 = Integer.parseInt(sub)
		suit2 = a.substring(2)
		counter++
		}
		if ((rank2 <= 0) || (rank2 > 13)) {
		println "Invalid rank.  Press ctrl-c to cancel and start again."
		}
		else if ((suit2 != "Hearts") && (suit2 != "Diamonds") && (suit2 != "Clubs") && (suit2 != "Spades")) {
		println "Invalid suit.  Press ctrl-c to cancel and start again."
		}
		if ((rank1 == rank2) && (suit1 == suit2)) {
			println "Invalid.  Cannot enter two cards of same rank and suit.  Press ctrl-c to quit and start again."
		}
}
if (counter == 2) {
a = System.console().readLine()
	if (a.substring(0,1) == "K") {
		rank3 = 13
		suit3 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "Q") {
		rank3 = 12
		suit3 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "J") {
		rank3 = 11
		suit3 = a.substring(2)
		counter++
	}
	else if ((a.substring(0,1) == "1") && (a.substring(1,2) == "0")) {
		rank3 = 10
		suit3 = a.substring(3)
		counter++
	}
	else {
	sub = a.substring(0,1)
	rank3 = Integer.parseInt(sub)
	suit3 = a.substring(2)
	counter++
	}
	if ((rank3 <= 0) || (rank3 > 13)) {
		println "Invalid rank.  Press ctrl-c to cancel and start again."
	}
	else if ((suit3 != "Hearts") && (suit3 != "Diamonds") && (suit3 != "Clubs") && (suit3 != "Spades")) {
		println "Invalid suit.  Press ctrl-c to cancel and start again."
	}
	if (((rank1 == rank3) && (suit1 == suit3)) || ((rank2 == suit3) && (suit2 == suit3))) {
		println "Invalid.  Cannot enter two cards of same rank and suit.  Press ctrl-c and start again."
	}
}
if (counter == 3) {
a = System.console().readLine()
	if (a.substring(0,1) == "K") {
		rank4 = 13
		suit4 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "Q") {
		rank4 = 12
		suit4 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "J") {
		rank4 = 11
		suit4 = a.substring(2)
		counter++
	}
	else if ((a.substring(0,1) == "1") && (a.substring(1,2) == "0")) {
		rank4 = 10
		suit4 = a.substring(3)
		counter++
	}
	else {
	sub = a.substring(0,1)
	rank4 = Integer.parseInt(sub)
	suit4 = a.substring(2)
	counter++
	}
	if ((rank4 <= 0) || (rank4 > 13)) {
		println "Invalid rank.  Press ctrl-c to cancel and start again."
	}
	else if ((suit4 != "Hearts") && (suit4 != "Diamonds") && (suit4 != "Clubs") && (suit4 != "Spades")) {
		println "Invalid suit.  Press ctrl-c to cancel and start again."
	}
	if (((rank1 == rank4) && (suit1 == suit4)) || ((rank2 == rank4) && (suit2 == suit4)) || ((rank3 == rank4) && (suit3 == suit4))) {
		println "Invalid.  Cannot enter two cards of same rank and suit.  Press ctrl-c and start again."
	}
}
if (counter == 4) {
a = System.console().readLine()
	if (a.substring(0,1) == "K") {
		rank5 = 13
		suit5 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "Q") {
		rank5 = 12
		suit5 = a.substring(2)
		counter++
	}
	else if (a.substring(0,1) == "J") {
		rank5 = 11
		suit5 = a.substring(2)
		counter++
	}
	else if ((a.substring(0,1) == "1") && (a.substring(1,2) == "0")) {
		rank5 = 10
		suit5 = a.substring(3)
		counter++
	}
	else {
	sub = a.substring(0,1)
	rank5 = Integer.parseInt(sub)
	suit5 = a.substring(2)
	counter++
	}
	if ((rank5 <= 0) || (rank5 > 13)) {
		println "Invalid rank.  Press ctrl-c to cancel and start again."
	}
	else if ((suit5 != "Hearts") && (suit5 != "Diamonds") && (suit5 != "Clubs") && (suit5 != "Spades")) {
		println "Invalid suit.  Press ctrl-c to cancel and start again."
	}
	if (((rank1 == rank5) && (suit1 == suit5)) || ((rank2 == rank5) && (suit2 == suit5)) || ((rank3 == rank5) && (suit3 == suit5)) || ((rank4 == rank5) && (suit4 == suit5))) {
		println "Invalid.  Cannot enter two cards of same rank and suit.  Press ctrl-c and start again."
	}
}
//End of entry phase, start of sorting phase. Ranks of cards will now be sorted into ascending order.
int sortMax, sort4, sort3, sort2, sortMin
sortMax = rank1
if (rank2 >= sortMax) {
	sort4 = sortMax
	sortMax = rank2
	}
//works
	else if (rank2 < sortMax) {
		sort4 = rank2
	}
if (rank3 >= sortMax) {
	sort3 = sort4
	sort4 = sortMax
	sortMax = rank3
	}
	else if (rank3 >= sort4) {
		sort3 = sort4
		sort4 = rank3
	}
	else if (rank3 < sort4) {
		sort3 = rank3
	}
if (rank4 >= sortMax) {
	sort2 = sort3
	sort3 = sort4
	sort4 = sortMax
	sortMax = rank4
 	}
 	else if (rank4 >= sort4) {
 		sort2 = sort3
 		sort3 = sort4
 		sort4 = rank4
 	}
 	else if (rank4 >= sort3) {
 		sort2 = sort3
 		sort3 = rank4
 	}
 	else if (rank4 < sort3) {
 		sort2 = rank4
 	}
if (rank5 >= sortMax) {
	sortMin = sort2
	sort2 = sort3
	sort3 = sort4
	sort4 = sortMax
	sortMax = rank5
	}
	else if (rank5 >= sort4) {
		sortMin = sort2
		sort2 = sort3
		sort3 = sort4
		sort4 = rank5
	}
	else if (rank5 >= sort3) {
		sortMin = sort2
		sort2 = sort3
		sort3 = rank5
	}
	else if (rank5 >= sort2) {
		sortMin = sort2
		sort2 = rank5
		}
	else if (rank5 < sort2) {
		sortMin = rank5
	}
//Cards are sorted.  Now the program determines whether the cards are consecutive, and whether the suits are all the same.
boolean consecutive = false
if ((sort2 == sortMin + 1) && (sort3 == sort2 + 1) && (sort4 == sort3 + 1) && (sortMax == sort4 + 1)) {
	consecutive = true
	}
	else {
	consecutive = false
	}
boolean StraightFlush = false
boolean Flush = false
if ((suit1 == suit2) && (suit2 == suit3) && (suit3 == suit4) && (suit4 == suit5)) {
	Flush = true
	if (consecutive) {
			StraightFlush = true
			}
	}
else {
	StraightFlush = false
}
if (StraightFlush) {
	println "Your hand is a Straight Flush."
	}
else {
	boolean Poker = false
		if ((sort2 == sort3) && (sort3 == sort4) && (sort4 == sortMax)) {
				Poker = true
		}
		else if ((sortMin == sort2) && (sort2 == sort3) && (sort3 == sort4)) {
			Poker = true
		}
		else {
			Poker = false
		}
if (Poker) {
	println "Your hand is Poker."
}
else if (!Poker) {
boolean FullHouse = false
if ((sortMin == sort2) && (sort2 != sort3) && (sort3 == sort4) && (sort4 == sortMax)) {
	FullHouse = true
	}
	else if ((sortMin == sort2) && (sort2 == sort3) && (sort3 == sort4) && (sort4 != sortMax)) {
	FullHouse = true
	}
if (FullHouse) {
	println "You have a Full House."
	}
else if (Flush) {
	println "Your hand is a Flush."
	}
else {
boolean Straight = false
if ((!Flush) && (consecutive)) {
	println "You have a Straight."
}
else { 
boolean ThreeKind = false
	if ((sortMin != sort2) && (sort4 != sortMax) && (sort2 == sort3) && (sort3 == sort4)) {
	ThreeKind = true
	}
	else if ((sortMin == sort2) && (sort2 == sort3) && (sort3 != sort4) && (sort4 != sortMax)) {
	ThreeKind = true
	}
	else if ((sortMin != sort2) && (sort2 != sort3) && (sort3 == sort4) && (sort4 == sortMax)) {
	ThreeKind = true
	}
	else {
	ThreeKind = false
	}
if (ThreeKind) {
	println "You have Three of a Kind."
}
else if (!ThreeKind) {
boolean TwoPairs = false
if ((sortMin == sort2) && (sort2 != sort3) && (sort3 == sort4) && (sort4 != sortMax)) {
	TwoPairs = true
	}
	else if ((sortMin != sort2) && (sort2 == sort3) && (sort3 != sort4) && (sort4 == sortMax)) {
	TwoPairs = true
	}
	else if ((sortMin == sort2) && (sort2 != sort3) && (sort3 != sort4) && (sort4 == sortMax)) {
	TwoPairs = true
	}
	else {
	TwoPairs = false
	}
if (TwoPairs) {
	println "You have Two Pairs."
	}
else if (!TwoPairs) {
boolean Pair = false
if ((sortMin == sort2) && (sort2 != sort3)) {
	Pair = true
	}
	else if ((sortMin != sort2) && (sort2 == sort3) && (sort3 != sort4) && (sort4 != sortMax)) {
	Pair = true
	}
	else if ((sortMin != sort2) && (sort2 != sort3) && (sort3 == sort4) && (sort4 != sortMax)) {
	Pair = true
	}
	else if ((sortMin != sort2) && (sort2 != sort3) && (sort3 != sort4) && (sort4 == sortMax)) {
	Pair = true
	}
	else {
	Pair = false
	}
if (Pair) {
	println "You have a Pair."
	}
else if (!Pair) {
	println "You have nothing."
	}
}



	
	





}
}
}
}
}
