package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
	private Point center;
	private int radius;

	public Circle() {}
			
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}


	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	

	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocna = (Circle) obj; 
			if (this.center
					.equals(pomocna.center) 
					&& this.radius == pomocna.radius
					&&  this.selected == pomocna.selected) 
				return true; 
			else
				return false; 
		} else
			return false;
	}

	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x,y);
		return (this.center.
				distance(sadrziTacku) <= this.radius);
	}
	
	public boolean contains(Point sadrziTacku) {
		//linija ispod je nepotrebna i nema smisla stavljati je ovde
		//Point sadrziTacku = new Point(x,y);
		return (this.center.
				distance(sadrziTacku) <= this.radius);
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX()-radius,
				center.getY()-radius, 2*radius, 2*radius);
		
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX() - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() + radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() - radius - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() + radius - 2, 4, 4);
			g.setColor(Color.black);
		}
	}
	
	public void moveTo(int x, int y) {
		center.moveTo(x, y);
	}

	@Override
	public void moveBy(int x, int y) {
		center.moveBy(x, y);
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Circle) {
			Circle shapeToCompare = (Circle)obj;
			return (int)(this.area() 
					- shapeToCompare.area());
		}
		return 0;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) throws Exception{
		if(radius < 0) {
			throw new Exception("Radius ne sme "
					+ "biti negativna vrednost");
		}
		this.radius = radius;
	}
	
	public String toString() {
		return "Center: " + center + ", radius = " + radius;
	}
}
