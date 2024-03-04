package introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prve vezbe
		System.out.println("Hello world - test");
		System.out.println("Hello world - test");
		
		// druge vezbe - prvi deo
		int prviBroj = 7;
		int drugiBroj;
		drugiBroj = 2;
		System.out.println(prviBroj/drugiBroj); //dobijamo int
		
		float treciBroj = 5.3f;
		double cetvrtiBroj = 5.1;
		System.out.println(treciBroj/cetvrtiBroj); //float ide 
			//u double pa je rezultat double tip podatka
		
		int petiBroj = 9;
		System.out.println(petiBroj/cetvrtiBroj); //int ima 32 bita, double ima 64 pa je rezultat double
		int rezultat =(int)(petiBroj/cetvrtiBroj); //eksplicitna konverzija
		System.out.println(rezultat);
		
		boolean alwaysTrue = true;
		boolean alwaysFalse = false;
		System.out.println(alwaysTrue && alwaysFalse);
		System.out.println(alwaysTrue || alwaysFalse);
		System.out.println(!alwaysTrue);
		
		char ch = '\n';
		String prviString = "abc";
		String drugiString = new String("def");
		System.out.println(prviString+drugiString);
		System.out.println(prviString.concat(drugiString));
		System.out.println(prviString+ch);
		
		String stringKaoBroj = "5";
		System.out.println(stringKaoBroj+prviBroj);// int u string
		//System.out.println((int)stringKaoBroj+prviBroj);
		System.out.println(Integer.parseInt(stringKaoBroj)+prviBroj);
	}
}
