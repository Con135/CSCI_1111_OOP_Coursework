public class Triangle extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;
	private double area;
	private double perimeter;
	
	Triangle() {
	}
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	//Area
	@Override
	public double getArea() {
		double s = ((side1 + side2 + side3) / 2);
		return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
	}
	//Perimeter
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}