package geometry;

public class Point {
	// stanje/atributi klase - private
	private int x;
	private int y;
	private boolean selected;
	
	
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
	
	
	

}
