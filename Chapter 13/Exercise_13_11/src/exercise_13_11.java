public class exercise_13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		double sides = 5;

		Octagon octagon1 = new Octagon(sides);
				
		Octagon octagon2 = (Octagon) octagon1.clone();
		
		System.out.println("\nArea of octagon 1: " + octagon1.getArea() + "\nArea of octagon 2: " + octagon2.getArea() + "\nCompare: " + octagon1.compareTo(octagon2));
	}
}