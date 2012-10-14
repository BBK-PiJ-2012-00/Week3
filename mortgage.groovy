double totalCostCalculator(double borrowed, double interestRate) {
	double rateMultiplier = 1 + (interestRate / 100);
	double cost = borrowed * rateMultiplier;
	result = cost;
	return result;
}
double repaymentsCalculator(double mortgageCost, double years) {
	double yearlyPayment = mortgageCost / years;
	result = yearlyPayment;
	return result;
}
double interestTimeCalculator(double mortgageCost, double borrowed, double repaymentRate) {
	double interestAmount = mortgageCost - borrowed;
	double interestTime
	double repaymentMonthly = repaymentRate / 12
	for (interestTime = 0; interestAmount > 0; interestTime++) {
		interestAmount = interestAmount - repaymentMonthly;
	}
	result = interestTime;
	return result;
}	
println "This program calculates the total mortgage amount to be paid, the money to be repaid every year, and the number of years before the interest is paid and only the initial capital remains.  Please begin by entering the following: "
print "Total amount borrowed: "
double borrowed = Double.parseDouble(System.console().readLine())
print "Years to pay it back: "
double years = Double.parseDouble(System.console().readLine())
print "The interest rate: "
double interestRate = Double.parseDouble(System.console().readLine())
double mortgageCost = totalCostCalculator(borrowed, interestRate);
println "The total cost of your mortgage is: £" + mortgageCost
double repaymentRate = repaymentsCalculator(mortgageCost, years);
println "You will need to repay £" + repaymentRate + " every year."
double interestAlone = interestTimeCalculator(mortgageCost, borrowed, repaymentRate);
if (interestAlone >= 12) {
	double interestYearly = interestAlone / 12
	println "It will take you " + interestYearly + " years to pay off the interest alone."
}
else if (interestAlone < 12) {
	println "It will take you " + interestAlone + " months to pay off the interest alone."
}



