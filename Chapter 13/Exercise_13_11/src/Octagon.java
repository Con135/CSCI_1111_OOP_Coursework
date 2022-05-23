public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	
	private double sides;
	private double area;
	
	Octagon() {
	}
	Octagon(double sides) {
		this.sides = sides;
	}
	//Area
	@Override
	public double getArea() {
		return ((2 + (4 / Math.sqrt(2))) * sides * sides);   
	}
	//Cloneable
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex){
			return null;
		}
	}
	//Comparable
	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() > ((Octagon) o).getArea()) {
			return 1;
		}
		else if (this.getArea() < ((Octagon) o).getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}