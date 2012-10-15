class Point {
	int x;
	int y;
}
class Rectangle {
	Point upLeft = new Point();
	Point downRight = new Point();
	//only works with new Point, not just Point.  This is because Points need defining within the class Rectangle, or it doesn't associate the information.
}
println "This program will calculate the area and perimeter of a rectangle based on the coordinates of two opposite corners -- the top left and the bottom right."
println "Please enter the coordinates of the top left corner: "
print "x: "
Rectangle rt = new Rectangle();
rt.upLeft.x = Integer.parseInt(System.console().readLine())
print "y: "
rt.upLeft.y = Integer.parseInt(System.console().readLine())
println "Now enter the coordinates of the bottom right corner: "
print "x: "
rt.downRight.x = Integer.parseInt(System.console().readLine())
print "y: "
rt.downRight.y = Integer.parseInt(System.console().readLine())
int length = rt.downRight.x - rt.upLeft.x
int height = rt.upLeft.y - rt.downRight.y
int perimeter = (length * 2) + (height * 2)
int area = length * height
println "The area of the rectangle is " + area + "."
println "The perimeter is " + perimeter + "."