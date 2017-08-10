
public class Main {
	
	public static void main(String[] args) {
	
		Triangle tr = new Triangle (new Point(1,1), new Point (2,3), new Point (3,4));
		Circle cr = new Circle (new Point (1,1),new Point (2,3));
		Square sq = new Square (new Point (1,1),new Point (2,3));
		
		System.out.println(tr.getPerimetr());
		System.out.println(tr.getArea());
		System.out.println(cr.getPerimetr());
		System.out.println(cr.getArea());
		System.out.println(sq.getPerimetr());
		System.out.println(sq.getArea());		
	
	}

}
