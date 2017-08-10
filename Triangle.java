
public class Triangle extends Shape{
	
	private Point a;
	private Point b;
	private Point c;

	
	public Triangle (Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Triangle() {
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double getPerimetr() {
		double p = Point.Length(a,b)+Point.Length(b,c)+Point.Length(a,c);
		return p;
	}
	@Override
	double getArea() {
		double pp = getPerimetr()/2;
		return Math.sqrt(pp*(pp-Point.Length(a,b))*(pp-Point.Length(b,c))*(pp-Point.Length(a,c)));
		
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}	
	
}
