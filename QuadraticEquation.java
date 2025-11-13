import java.util.Scanner;

public class QuadraticEquation {
public static void main(String[] args) {
double a, b, c, discriminant, root1, root2;

Scanner sc = new Scanner(System.in);

// Read inputs
System.out.print("Enter coefficient a: ");
a = sc.nextDouble();
System.out.print("Enter coefficient b: ");
b = sc.nextDouble();
System.out.print("Enter coefficient c: ");
c = sc.nextDouble();

// Calculate discriminant
discriminant = b * b - 4 * a * c;

// Check if discriminant is negative, zero, or positive
if (discriminant > 0) {
root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
System.out.println("The equation has two real roots:");
System.out.println("Root 1 = " + root1);
System.out.println("Root 2 = " + root2);
} else if (discriminant == 0) {
root1 = -b / (2 * a);
System.out.println("The equation has one real root:");
System.out.println("Root = " + root1);
} else {
System.out.println("The equation has no real solutions.");
}

sc.close();
}
}