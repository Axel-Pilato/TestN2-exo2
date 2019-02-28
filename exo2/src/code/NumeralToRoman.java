package code;

public class NumeralToRoman {
	
	public String getRoman(int nombre) {
		String romain = null;
		
		if(nombre != 0) {
			System.out.println(nombre);
			
			while(nombre > 0) {
				if(nombre > 1000) {
					nombre = nombre/1000;
					romain = romain+"M";
					System.out.println(nombre);
					System.out.println("M");
				}
				else if(nombre > 500) {
					nombre = nombre/500;
					romain = romain+"D";
					System.out.println(nombre);
				}
				else if(nombre > 100) {
					nombre = nombre/100;
					romain = romain+"C";
					System.out.println(nombre);
				}
				else if(nombre > 50) {
					nombre = nombre/50;
					romain = romain+"L";
					System.out.println(nombre);
				}
				else if(nombre > 10) {
					nombre = nombre/10;
					romain = romain+"X";
					System.out.println(nombre);
				}
				else if(nombre > 5) {
					nombre = nombre/5;
					romain = romain+"V";
					System.out.println(nombre);
				}
				else if(nombre > 1) {
					nombre = nombre - 1;
					romain = romain+"I";
					System.out.println(nombre);
				}
			}
		}
		else System.out.println("Entrez un nombre superieur � 0");
	 return romain;
	}

}
