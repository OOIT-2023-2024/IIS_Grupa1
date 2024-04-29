package geometry;

import java.awt.Graphics;

public class Point extends Shape{
	// stanje/atributi klase - private
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
		
	public double distance(Point drugaTacka) {
		int a = this.x - drugaTacka.getX();
		int b = this.y - drugaTacka.y;
		double distance = Math.sqrt(a*a+b*b);
		return distance;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Point) { 
			if(this.x == ((Point)obj).x 
					&& this.y == ((Point)obj).y
					&& this.selected == ((Point)obj).selected)
				return true;
			return false;
		}
		return false;
		
	}
	
	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x,y);
		return this.distance(sadrziTacku) <= 2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void moveBy(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Point) {
			Point shapeToCompare = (Point)o;
			return (int)this.distance(new Point(0,0))
					- (int)shapeToCompare
					.distance(new Point(0,0));
		}
		return 0;
	}
	
	//metode pristupa - public
	// metode instance
	public int getX() {
		//ovde je x i this.x isto
		//return x;
		return this.x;
	}
	
	//prvi nacin
//	public void setX(int xKoordinata) {
		//ovde ce znati da je x property jer je naziv parametra metode drugaciji
//		x=xKoordinata;
//	}
	
	public void setX(int x) {
		//this.x je property a x je parametar metode
		this.x=x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//isti potpis kao i u klasi Object
	public String toString() {
		return "(" + this.x + "," + this.y+")";
	}



}
