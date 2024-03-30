package geometry;

public class Donut extends Circle {
	// nasledjuje center, radius i selected od Circle
	private int innerRadius;

	public Donut() {
	}

	// ovaj je vise demonstracije radi
	public Donut(Point center, int radius, boolean selected) {
		// poziv konstruktora iz direktno nadređene klase - super(...)
		super(center, radius);

		// select je protected pa moze ovako:
		this.selected = selected;
		/*
		 * super.selected = selected; setSelected(selected);
		 * super.setSelected(selected);
		 */

		// ovo ne moze jer je center private:
		// this.center..
		// super.center...
		// ali moze
		/*
		 * super.setCenter(center); setCenter(center);
		 */
	}

	public Donut(Point center, int radius, int innerRadius) {
		// super(center, radius, selected);
		// umesto super mogu i
		super(center, radius);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		// super(center, radius, selected);
		// umesto super mogu i
		this(center, radius, selected);
		this.innerRadius = innerRadius;
	}

	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}

	public double circumference() {
		return super.circumference() + 2 * innerRadius * Math.PI;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Donut) {
			Donut pomocna = (Donut) obj;
			if (getCenter().equals(pomocna.getCenter()) && getRadius() == pomocna.getRadius()
					&& innerRadius == pomocna.getInnerRadius())
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean contains(int x, int y) {

		return super.contains(x, y) && getCenter().distance(new Point(x, y)) >= innerRadius;
	}

	public boolean contains(Point p) {

		return this.contains(p.getX(), p.getY());
	}

	// ostale get i set nasledjuje iz Circle
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	// redefinise toString iz Circle
	// da ne postoji u Circle redefinisao bi onu toString metodu
	// iz klase Object
	public String toString() {
		// ako kazemo toString() dobijamo rekurziju
		// zato treba reci super.toString()
		return super.toString() + ", innerRadius = " + innerRadius;
	}

}
