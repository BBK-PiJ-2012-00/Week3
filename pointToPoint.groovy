class Point {
	double x;
	double y;
}
println "This program takes in three coordinates and outputs the two coordinates that are closest.  Please enter as prompted."
println "First coordinate: "
print "x: "
Point first = new Point();
first.x = Double.parseDouble(System.console().readLine())
print "y: "
first.y = Double.parseDouble(System.console().readLine())
println "Second coordinate: "
print "x: "
Point second = new Point();
second.x = Double.parseDouble(System.console().readLine())
print "y: "
second.y = Double.parseDouble(System.console().readLine())
println "Third coordinate: "
print "x: "
Point third = new Point();
third.x = Double.parseDouble(System.console().readLine())
print "y: "
third.y = Double.parseDouble(System.console().readLine())
//Input phase: working.
double firstTotal = first.x + first.y
double secondTotal = second.x + second.y
//Sort coordinate totals into ascending order
double sortMax = firstTotal
double sortMid, sortMin
	if (secondTotal >= firstTotal) {
		sortMid = firstTotal
		sortMax = secondTotal
	}
	else if (secondTotal < firstTotal) {
		sortMid = secondTotal
	}
double thirdTotal = third.x + third.y
	if (thirdTotal >= sortMax) {
 		sortMin = sortMid
		sortMid = sortMax
 		sortMax = thirdTotal 		
 	}
 	else if (thirdTotal >= sortMid) {
 		sortMin = sortMid
 		sortMid = thirdTotal
 	}
 	else if (thirdTotal < sortMid) {
 		sortMin = thirdTotal
 	}
//Sort phase: working.
if ((sortMax - sortMid) > (sortMid - sortMin)) {
	if (((sortMid == firstTotal) && (sortMin == secondTotal)) || ((sortMid == secondTotal) && (sortMin == firstTotal))) {
		println "The first coordinates, (" + first.x + "," + first.y + "), and second coordinates, (" + second.x + "," + second.y + ") were closest."
	}
	else if (((sortMid == firstTotal) && (sortMin == thirdTotal)) || ((sortMid == thirdTotal) && (sortMin == firstTotal))) {
		println "The first coordinates, (" + first.x + "," + first.y + "), and third coordinates, (" + third.x + "," + third.y + ") were closest." 
	}
	else if (((sortMid == secondTotal) && (sortMin == thirdTotal)) || ((sortMid == thirdTotal) && (sortMin == secondTotal))) {
		println "The second coordinates, (" + second.x + "," + second.y + "), and third coordinates, (" + third.x + "," + third.y + ") were closest."
	}
}
else if ((sortMax - sortMid) == (sortMid - sortMin)) {
	println "The distance between your coordinates is equal."
	}
else if ((sortMax - sortMid) < (sortMid - sortMin)) {
		if (((sortMax == firstTotal) && (sortMid == secondTotal)) || ((sortMax == secondTotal) && (sortMid == firstTotal))) {
		println "The first coordinates, (" + first.x + "," + first.y + "), and second coordinates, (" + second.x + "," + second.y + ") were closest."
	}
	else if (((sortMax == firstTotal) && (sortMid == thirdTotal)) || ((sortMax == thirdTotal) && (sortMid == firstTotal))) {
		println "The first coordinates, (" + first.x + "," + first.y + "), and third coordinates, (" + third.x + "," + third.y + ") were closest." 
	}
	else if (((sortMax == secondTotal) && (sortMid == thirdTotal)) || ((sortMax == thirdTotal) && (sortMid == secondTotal))) {
		println "The second coordinates, (" + second.x + "," + second.y + "), and third coordinates, (" + third.x + "," + third.y + ") were closest."
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 		