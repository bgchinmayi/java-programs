// Abstract class Shape
abstract class Shape {
int dim1, dim2;

Shape(int d1, int d2) {
dim1 = d1;
dim2 = d2;
}

// Abstract method to print area
abstract void printArea();
}

// Rectangle class extends Shape
class Rectangle extends Shape {
Rectangle(int length, int breadth) {
super(length, breadth);
}

void printArea() {
int area = dim1 * dim2;
System.out.println("Area of Rectangle: " + area);
}
}

// Triangle class extends Shape
class Triangle extends Shape {
Triangle(int base, int height) {
super(base, height);
}

void printArea() {
double area = 0.5 * dim1 * dim2;
System.out.println("Area of Triangle: " + area);
}
}

// Circle class extends Shape
class Circle extends Shape {
Circle(int radius) {
super(radius, 0);
}

void printArea() {
double area = 3.14159 * dim1 * dim1;
System.out.println("Area of Circle: " + area);
}
}

// Main class to test the program
public class AbstractShapeDemo{
public static void main(String[] args) {
Rectangle rect = new Rectangle(10, 5);
Triangle tri = new Triangle(10, 8);
Circle cir = new Circle(7);

rect.printArea();
tri.printArea();
cir.printArea();
}
}