public class exercise_10_3 {
	public static void main(String[] args) {
		MyInteger myInteger = new MyInteger(1);
		char[] valueC = {'1', '2', '3'};
		System.out.println("Non-static even: " + myInteger.isEven(myInteger.getValue()));
		System.out.println("Non-static odd: " + myInteger.isOdd(myInteger.getValue()));
		System.out.println("Non-static prime: " + myInteger.isPrime(myInteger.getValue()));
		System.out.println();
		System.out.println("Static even: " + myInteger.isEven(0));
		System.out.println("Static odd: " + myInteger.isOdd(0));
		System.out.println("Static prime: " + myInteger.isPrime(0));
		System.out.println();
		System.out.println("MyInteger even: " + myInteger.isEven(myInteger));
		System.out.println("MyInteger odd: " + myInteger.isOdd(myInteger));
		System.out.println("MyInteger prime: " + myInteger.isPrime(myInteger));
		System.out.println();
		System.out.println("Integer equals: " + myInteger.equals(0));
		System.out.println("MyInteger equals: " + myInteger.equals(myInteger));
		System.out.println();
		System.out.println("ParseInt(char[]): " + myInteger.parseInt(valueC));
		System.out.println();
		System.out.println("ParseInt(String): " + myInteger.parseInt("123"));
	}
}

class MyInteger {
	int value;
	String valueS = value + "";
	
	MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	public boolean isOdd() {
		return isOdd(value);
	}
	public boolean isPrime() {
		return isPrime(value);
	}
	
	static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isPrime(int value) {
		for (int count1 = 1; count1 <= value; count1++) {
			if (value % count1 == 0 && count1 != 1 && count1 != value) {
				return false;
			}
			else {
			}
		}
		return true;
	}
	
	static boolean isEven(MyInteger A) {
		return isEven(A.getValue());
	}
	static boolean isOdd(MyInteger A) {
		return isOdd(A.getValue());
	}
	static boolean isPrime(MyInteger A) {
		return isPrime(A.getValue());
	}
	
	boolean equals(int value) {
		if (value == value) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean equals(MyInteger A) {
		return equals(A.getValue());
	}
	static int parseInt(char[] valueC) {
		int total = 0;
		String numberS = "";
		for(int count2 = 0; count2 < valueC.length; count2++) {
			numberS = numberS + valueC[count2];
			int number = Integer.parseInt(numberS);
			total += number;
			numberS = "";
		}
		return total;
	}
	static int parseInt(String valueS) {
		return Integer.parseInt(valueS);
	}
}