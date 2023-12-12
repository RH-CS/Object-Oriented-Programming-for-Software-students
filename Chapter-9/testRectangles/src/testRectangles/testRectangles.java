package testRectangles;

public class testRectangles {
	public static void main(String args[]) {
		
		Rectangle rectangle1 = new Rectangle(40, 4);
		System.out.println("Rectangle 1 \nWidth: " + rectangle1.width + "\nHeight: " + rectangle1.height + "\nArea: " + rectangle1.getArea() + "\nPerimeter: " + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(39.5, 3.5);
		System.out.println("\nRectangle 2 \nWidth: " + rectangle2.width + "\nHeight: " + rectangle2.height + "\nArea: " + rectangle2.getArea() + "\nPerimeter: " + rectangle2.getPerimeter());
		
	}

}
class Rectangle {
	double width;
	double height;
	
	Rectangle() {
		width = 2;
		height = 3;
	}
	
	Rectangle(double newHeight, double newWidth) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return (2 * width) + (2 * height);
	}
	
	
}
