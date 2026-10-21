package exercise_5;

public class Rectangle implements Shape, TwoDShape{

	private double base;
	private double height;
	private Point2D points;
	
	public Rectangle() {}
	// costruttore vuoto andrebbe a generare NullPointerException
	
	public Rectangle(double base, double height, Point2D points) {
		
		this.base = base;
		this.height = height;
		this.points = points;
		
	}
	

	@Override
	public double area() {
		return base * height;
	}

	@Override
	public double perimeter() {
		
		return ((base * 2) + (height * 2));
		
	}

	@Override
	public String draw() {
	
		return "La base equivale a:" + base + ", l'altezza equivale a:" + height + 
				", i punti nello spazio sono: x = " + points.getX() +  " e y = " + points.getY() ;
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Point2D getPoints() {
		return points;
	}

	public void setPoints(Point2D points) {
		this.points = points;
	}
	
	
	
	
}
