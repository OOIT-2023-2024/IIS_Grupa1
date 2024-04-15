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
		Point novaTacka = new Point(10,15, true);
		System.out.println(novaTacka.getX());
		System.out.println(novaTacka.isSelected());
		Point novaTacka2 = new Point(10,15, true);
		
		Line novaLinija = new Line(novaTacka, novaTacka2);
		//ovde sad nece biti null pointer exception
		System.out.println(novaLinija.getStartPoint().getX());
		
		//pre redefinianja toString() metode izbacuje referencu
		//nakon redefinisanja vraca (10,15)
		System.out.println(novaTacka.toString());
		//u pozadini poziva toString() iz klase Object ako nije definisana u Point
		//ako jeste onda poziva tu metodu
		System.out.println(novaTacka);
		System.out.println(line1);
		System.out.println(line1.toString());
		
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		//kod slozenih tipova == poredi reference
		//vraca false zbog operatora new
		System.out.println(novaTacka == novaTacka2);
		//vraca true jer je pocetna tacka linije u stvari novaTacka
		System.out.println(novaTacka == novaLinija.getStartPoint());
		
		//metoda equals() poredi po vrednosti ako je redefinisemo
		//u npr klasi Point
		//ako ne vraca proveru po referenci jer Object ne zna sta su 
		//property tacke (Point)
		System.out.println(novaTacka.equals(novaTacka2));
		System.out.println(novaTacka.equals(novaTacka2));
		
		System.out.println(novaTacka.equals(novaLinija));
		
		//Pete vezbe
		novaTacka.contains(5, 10);
		novaLinija.contains(5, 15);
		rect1.contains(novaTacka2);
		
		
		//ja kao korisnik znam da postoji tacka, radius, innerRadius, selected
		//a ne da li je on krug ili nije
		Donut donut1 = new Donut(novaTacka, 50, true);
		Circle donut2 = new Donut(novaTacka, 50, true);
		Object donut3 = new Donut(novaTacka, 50, true);
		//ova prva naredba ispod ne valja
		//Donut donut4 = new Circle();
		
		//ne moze downcast da se uradi
		//jer smo Circle circle1 kreirali sa new Circle
		//a ne sa new Donut
		//Donut donut4 = (Donut)circle1;
		
		Donut donut5 = new Donut(novaTacka, 50, 45, true);	
		System.out.println(donut5);
		
		//Apstrakcija u programiranju
		//Shape shape1 = new Shape();--nije dozvoljeno
		Shape shape1 = new Point(15,25);
		System.out.println(shape1.isSelected());
	}
	
	

}
