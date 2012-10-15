class Point {
	int x;
	int y;
}
class Rectangle {
	Point upLeft = new Point();
	Point downRight = new Point();
	Point testPoint = new Point();
}
Rectangle rec = new Rectangle();
println "WELCOME TO... INSIDE or OUTSIDE"
println "This program creates a rectangle based on inputs from the user defining the top left corner and the bottom right. A third point will then be requested from the user; the program will determine if it falls inside or outside the rectangle."
println "Please enter the coordinates of the top left corner: "
print "x: "
rec.upLeft.x = Integer.parseInt(System.console().readLine())
print "y: "
rec.upLeft.y = Integer.parseInt(System.console().readLine())
println "Now enter the coordinates of the bottom right corner: "
print "x: "
rec.downRight.x = Integer.parseInt(System.console().readLine())
print "y: "
rec.downRight.y = Integer.parseInt(System.console().readLine())
println "Lastly, enter the coordinates for the third point: "
print "x: "
rec.testPoint.x = Integer.parseInt(System.console().readLine())
print "y: "
rec.testPoint.y = Integer.parseInt(System.console().readLine())
if ((rec.testPoint.x < rec.upLeft.x) || (rec.testPoint.x > rec.downRight.x) || (rec.testPoint.y > rec.upLeft.y) || (rec.testPoint.y < rec.downRight.y)) {
	println "The third point lies outside of the rectangle defined by your first two points."
}
else {
	println "The third point lies within the rectangle defined by your first two points."
}
