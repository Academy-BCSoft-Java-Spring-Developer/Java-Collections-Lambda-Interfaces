package exercise_5;

public class Square implements Shape, TwoDShape{

	private double side;
	private Point2D points;
	
	public Square() {}
	
	public Square(double side, Point2D points) {
		
		this.side = side;
		this.points = points;
		
	}
	
	@Override
	public double area() {
		
		return side * side;
	}
	
	@Override 
	public double perimeter() {
		
		return side * 4;
		
	}
	
	@Override 
	public String draw() {
		
		return "Il quadrato ha ogni lato lungo: " + side + "cm, " 
				+ "i punti nello spazio sono: x = " + points.getX()
				+ " y = " + points.getY();
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Point2D getPoints() {
		return points;
	}

	public void setPoints(Point2D points) {
		this.points = points;
	}
	
	
	
	
}
