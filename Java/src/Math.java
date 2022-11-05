
public class Math {

	private static final double number1=999.99;
	private static final double number2=888.88;
	private double a;
	private double b;
	
	public Math() {
		a=number1;
		b=number2;
	}
	public Math(double newA, double newB) {
		a=newA;
		b=newB;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double doMath() {
		return (a+b);
	}
}
