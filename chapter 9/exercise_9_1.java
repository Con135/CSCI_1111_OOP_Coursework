public class exercise_9_1 {
	public static void main(String[] args) {
		
		//Create rectangle 1
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("Rectangle object 1:\nWidth: " + rectangle1.width + "\nHeight: " + rectangle1.height + "\nArea: " + rectangle1.getArea() + "\nPerimeter: " + rectangle1.getPerimeter());
		
		//Spacer
		System.out.println("");
		
		//Create rectangle 2
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle object 2:\nWidth: " + rectangle2.width + "\nHeight: " + rectangle2.height + "\nArea: " + rectangle2.getArea() + "\nPerimeter: " + rectangle2.getPerimeter());	
	}
}
class Rectangle {
	double width = 1;
	double height = 1;
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
		
	double getArea() {
		return width * height;
	}
		
	double getPerimeter() {
		return (width * 2) + (height * 2);
	}
	void setWidth(double newWidth) {
		width = newWidth;
	}
	void setHeight(double newHeight) {
		height = newHeight;
	}
}
