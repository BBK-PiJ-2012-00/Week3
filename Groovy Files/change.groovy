println "Please enter the total cost of your purchase: "
double cost = Double.parseDouble(System.console().readLine())
println "Now enter the amount of money you have paid: "
double paid = Double.parseDouble(System.console().readLine())
double changeTotal = paid - cost
double fifties = 0, twenties = 0, tens = 0, fives = 0, pounds = 0, fiftyp = 0, twentyp = 0, tenp = 0, fivep = 0, twop = 0, onep = 0
while (changeTotal >= 50) {
	changeTotal = changeTotal - 50
	fifties++
}
while (changeTotal >= 20) {
	changeTotal = changeTotal - 20
	twenties++
}
while (changeTotal >= 10) {
	changeTotal = changeTotal - 10
	tens++
}
while (changeTotal >=5) {
	changeTotal = changeTotal - 5
	fives++
}
while (changeTotal >= 1) {
	changeTotal = changeTotal - 1
	pounds++
}
while (changeTotal >= 0.50) {
	changeTotal = changeTotal - 0.50
	fiftyp++
}
while (changeTotal >= 0.20) {
	changetotal = changeTotal - 0.20
	twentyp++
}
while (changeTotal >= 0.10) {
	changeTotal = changeTotal - 0.10
	tenp++
}
while (changeTotal >= 0.05) {
	changeTotal = changeTotal - 0.05
	fivep++
}
while (changeTotal >= 0.02) {
	changeTotal = changeTotal - 0.02
	twop++
}
while (changeTotal >= 0.01) {
	changeTotal = changeTotal - 0.01
	onep++
}
char poundSign = '\u00A3'
println "You are owed " + changeTotal + " in change."
println fifties + " x " + poundSign + "50 notes"
println twenties + " x £20 notes"
println tens + " x £10 notes"
println fives + " x £5 notes"
println pounds + " x £1 coins"
println fiftyp + " x 50p coins"
println twentyp + " x 20p coins"
println tenp + " x 10p coins"
println fivep + " x 5p coins"
println twop + " x 2p coins"
println onep + " x 1p coins"