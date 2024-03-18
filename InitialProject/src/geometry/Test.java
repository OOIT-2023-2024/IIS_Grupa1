package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kreiramo konkretnu tacku, tj. objekat klase Point
		Point prvaTackaTest = new Point();
		System.out.println(prvaTackaTest.getX());
		Point drugaTacka = new Point();
		System.out.println(drugaTacka.getX());
		prvaTackaTest.setX(80);
		System.out.println(prvaTackaTest.getX());
		int y = 150;
		drugaTacka.setY(y);
		System.out.println(drugaTacka.getY());

		// distance();--ne valja
		// Point.distance();--ne valja jer nije staticka metoda
		double distance = prvaTackaTest.distance(drugaTacka);
		System.out.println(distance);

		// Zadačići
		// 1.
		Point point1 = new Point();
		Point point2 = new Point();
		Line line1 = new Line();
		// 2.
		point1.setX(20);
		point1.setY(40);
		point2.setX(60);
		point2.setY(30);
		// 3.
		point1.setX(point2.getY());
		System.out.println(point1.getX());

		// 4.
		// System.out.println(line1.getStartPoint().getX());
		// prethodna linija vraca null, jer start point nije inicijalizovan

		// 5.
		line1.setStartPoint(point1);
		line1.setEndPoint(point2);

		System.out.println(line1.getStartPoint().getX());
		System.out.println(line1.getStartPoint().getY());

		System.out.println(line1.getEndPoint().getX());
		System.out.println(line1.getEndPoint().getY());

		// 4.
		System.out.println(line1.getStartPoint().getX());

		// 6.
		line1.getEndPoint().setY(23);
		System.out.println(line1.getEndPoint().getY());
		// prenos po referenci!!
		System.out.println(point2.getY());

		// 7.
		line1.getStartPoint().setX(line1.getEndPoint().getY());
		//8.
		System.out.println(point1.getX());
		System.out.println(point2.getY());
		//9.
		line1.getEndPoint().setX((int)(line1.length() - 
				line1.getStartPoint().getX()+
				line1.getStartPoint().getY()));
		
		//Domaci
		Rectangle rect1 = new Rectangle();
		Point upperLeftPoint = new Point();
		rect1.setUpperLeftPoint(upperLeftPoint);
		rect1.getUpperLeftPoint().setX(10);
		
		
		Point center = new Point();
		Circle circle1 = new Circle();
		circle1.setCenter(center);
		circle1.getCenter().setX(rect1.getUpperLeftPoint().getX());
		
		
		//Vezbe 4.
		Point novaTacka = new Point(10,15);
		System.out.println(novaTacka.getX());
		System.out.println(novaTacka.isSelected());
		Point novaTacka2 = new Point(10,15, true);
		
		Line novaLinija = new Line(novaTacka, novaTacka2);
		//ovde sad nece biti null pointer exception
		System.out.println(novaLinija.getStartPoint().getX());

	}

}
