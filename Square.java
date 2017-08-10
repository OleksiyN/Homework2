
public class Square extends Shape {
	private Point a;
	private Point b;
	
	public Square (Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	
	public Square() {
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
	double getPerimetr() {
		return Point.Length(a, b)*4;
	}
	@Override
	double getArea() {
		return Math.pow(Point.Length(a, b), 2);
	}
}
