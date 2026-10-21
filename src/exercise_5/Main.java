package exercise_5;

public class Main {

	public static void main(String[] args) {
		
		Point2D p2D = new Point2D(1,2);
		Rectangle r = new Rectangle(5.0, 3.0, p2D);
		
		System.out.println(r.draw());

		System.out.println(r.getPoints().getX());
		System.out.println(r.area());
		System.out.println(r.perimeter());
	}

}
