package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {
	
	//private int pocetnaTackaX;
	//private int pocetnaTackaY;
	//koristimo postojeći deo koda - ono gore ne treba
	private Point startPoint;
	private Point endPoint;
	
	public Line() {}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public double length() {
		//reusable
		double length = startPoint.distance(endPoint);
		return length;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line pomocna = (Line) obj;
			if (this.startPoint
					.equals(pomocna.startPoint) 
					&& this.endPoint
					.equals(pomocna.endPoint)
					&& this.selected == pomocna.selected)
				return true;
			else 
				return false;
		} else 
			return false;
	}

	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x,y);
		return this.startPoint.distance(sadrziTacku)
				+ this.endPoint.distance(sadrziTacku) 
				- length() <= 2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(),
				endPoint.getX(), endPoint.getY());	
		
		if(isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(startPoint.getX()-2, startPoint.getY()-2, 4, 4);
			g.drawRect(endPoint.getX()-2, endPoint.getY()-2, 4, 4);
			g.setColor(Color.black);}
	}
	
	public void moveTo(int x, int y) {
		//ako bismo je implementirali 
		//od linije bismo dobili tacku
	}

	@Override
	public void moveBy(int x, int y) {
		startPoint.moveBy(x, y);
		endPoint.moveBy(x, y);
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Line) {
			Line shapeToCompare = (Line)obj;
			return (int)(this.length() 
					- shapeToCompare.length());
		}
		return 0;
	}

	
	public Point getStartPoint() {
		return this.startPoint;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public String toString() {
		return startPoint.toString() + " --> " + endPoint; // (xS,yS) --> (xE,yE)
	}


	

}
