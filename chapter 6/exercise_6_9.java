public class exercise_6_9 {
	public static void main(String[] args) {
		double foot = 1.0;
		double meter = 20.0;
		int row = 0;
		double[][] conversionExamples;
		System.out.println("Feet   Meters   Meters   Feet");
		System.out.println("-----------------------------");
		conversionExamples = new double[10][4];
	
		for(int count = 0; count < 10; count++) {
		
			conversionExamples[row][0] = foot;
			conversionExamples[row][1] = footToMeter(foot);
			conversionExamples[row][2] = meter;
			conversionExamples[row][3] = meterToFoot(meter);
			
			row++;
			foot += 1;
			meter += 5;
		}
		
		for(int r = 0; r < conversionExamples.length; r++) {
			for(int column = 0; column < conversionExamples[r].length; column++) {
					if(column == 1|| column == 3) {
						System.out.printf("%4.3f   ", conversionExamples[r][column]);
					}
					else {
						System.out.print(conversionExamples[r][column] + "   ");
					}		
			}
		System.out.println();
		}
	}
	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		double result = foot * 0.305;
		return result;
	}
	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		double result = meter * 3.279;
		return result;
	}
}