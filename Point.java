
public class Point {
	
	private double x;
	private double y;
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public static double Length (Point x, Point y){
		return Math.sqrt(Math.pow((x.getX()+y.getX()),2) + Math.pow((x.getY()+y.getY()),2));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
