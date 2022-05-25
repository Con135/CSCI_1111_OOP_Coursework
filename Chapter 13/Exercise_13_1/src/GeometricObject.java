public abstract class GeometricObject {
	public static String color;
	public static boolean filled;
			
	protected GeometricObject() {
	}
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	//Color	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Filled
	public boolean isFilled() {
		return filled;
	}
	public String toString() {
		return "\nColor of triangle: " + getColor() + "\nTriangle filled: " + isFilled();
	}
	public abstract double getArea();
	
	public abstract double getPerimeter();
}