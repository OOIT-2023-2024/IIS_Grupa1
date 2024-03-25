package geometry;

public class Point {
	// stanje/atributi klase - private
	private int x;
	private int y;
	private boolean selected;
	
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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	//isti potpis kao i u klasi Object
	public String toString() {
		return "(" + this.x + "," + this.y+")";
	}
	
	
	

}
