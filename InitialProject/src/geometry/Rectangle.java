package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
	
	private Point upperLeftPoint;
	private int width;
	private int height;
	
	public Rectangle() {
		
	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}
	
	public int area() {
		return width * height;
	}
	
	public int circumference() {
		return 2*width + 2*height;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint
					.equals(pomocna.upperLeftPoint) 
					&& this.width == pomocna.width 
					&& this.height == pomocna.height
					&& this.selected == pomocna.selected)
				return true;
			else 
				return false;
		} else
			return false;
	}

	public boolean contains(int x, int y) {
		return (x >= this.upperLeftPoint.getX() 
				&& x <= this.upperLeftPoint.getX() 
				+ width
				&& y >= this.upperLeftPoint.getY()
				&& y <= this.upperLeftPoint.getY()
				+ height);
	}
	
	//overloading demonstracija
	public boolean contains(Point sadrziTacku) {
		return (sadrziTacku.getX() >= this.upperLeftPoint.getX() 
				&& sadrziTacku.getX() <= this.upperLeftPoint.getX() 
				+ width
				&& sadrziTacku.getY() >= this.upperLeftPoint.getY()
				&& sadrziTacku.getY() <= this.upperLeftPoint.getY()
				+ height);
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(),
				width, height);
		
		if (isSelected()) {
			g.setColor(Color.blue);
			g.drawRect(upperLeftPoint.getX() - 2, upperLeftPoint.getY() - 2, 4, 4);
			g.drawRect(upperLeftPoint.getX() + width - 2, upperLeftPoint.getY() - 2, 4, 4);
			g.drawRect(upperLeftPoint.getX() - 2, upperLeftPoint.getY() + height - 2, 4, 4);
			g.drawRect(upperLeftPoint.getX() + width - 2, upperLeftPoint.getY() 
					+ height - 2, 4, 4);
			g.setColor(Color.black);
		}
	}
	
	public void moveTo(int x, int y) {
		upperLeftPoint.moveTo(x, y);
	}

	@Override
	public void moveBy(int x, int y) {
		upperLeftPoint.moveBy(x, y);
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle shapeToCompare = (Rectangle)obj;
			return this.area() 
					- shapeToCompare.area();
		}
		return 0;
	}
	
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return "Upper left point: " + upperLeftPoint 
				+ ", width = " + width 
				+ ", height = " + height;
	}
	
	
}
