
public class Circle extends Shape {
	
	private Point a;
	private Point b;
	
	public Circle (Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	public Circle() {
		super();
	}

	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	@Override
	public double getPerimetr() {
		return 2*Math.PI*Point.Length(a, b);
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(Point.Length(a, b), 2); 
	}
	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}
	
}
