public class exercise_11_1 {
	public static void main(String[] args) {
		GeometricObject object = new GeometricObject();
		Triangle triangle = new Triangle(2.0, 3.0, 4.0);
		System.out.println("GeometricObject: date created = " + object.dateCreated);
		System.out.println("Triangle: area = " + triangle.getArea());
		System.out.println("Triangle: perimeter = " + triangle.getPerimeter());
		System.out.println(triangle.toString());
	}
}
	
class GeometricObject {
	java.util.Date dateCreated;
	
	GeometricObject() {
		dateCreated = new java.util.Date();
	}
}

class Triangle extends GeometricObject {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle() {
	}
	Triangle(double newSide1, double newSide2, double newSide3) {
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
	}
	public double getSide1() {
		return side1;
	}
	void setSide1(double newSide1) {
		side1 = newSide1;
	}
	public double getSide2() {
		return side2;
	}
	void setSide2(double newSide2) {
		side2 = newSide2;
	}
	public double getSide3() {
		return side3;
	}
	void setSide3(double newSide3) {
		side3 = newSide3;
	}
	public double getArea() {
		double s = (getSide1() + getSide2() + getSide3()) / 2;
		return Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
	}
	public double getPerimeter() {
		return (getSide1() + getSide2() + getSide3());
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}