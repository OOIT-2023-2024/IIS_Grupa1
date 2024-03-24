package geometry;

public class Line {
	
	//private int pocetnaTackaX;
	//private int pocetnaTackaY;
	//koristimo postojeći deo koda - ono gore ne treba
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
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
			if (this.startPoint.equals(pomocna.startPoint) && this.endPoint.equals(pomocna.endPoint))
				return true;
			else 
				return false;
		} else 
			return false;
	}

	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x,y);
		return this.startPoint.distance(sadrziTacku) + this.endPoint.distance(sadrziTacku) - length() <= 2;
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
