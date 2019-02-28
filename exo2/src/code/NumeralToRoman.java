package code;

public class NumeralToRoman {
	
	public String getRoman(int nombre) {
		String romain = "";
		
		if(nombre != 0) {
			System.out.println(nombre);
			
			while(nombre > 1) {
				if(nombre >= 1000) {
					nombre = nombre-1000;
					romain = romain+"M";
					System.out.println("M");
				}
				else if(nombre >= 500) {
					nombre = nombre-500;
					romain = romain+"D";
					System.out.println("D");
				}
				else if(nombre >= 100) {
					nombre = nombre-100;
					romain = romain+"C";
					System.out.println("C");
				}
				else if(nombre >= 50) {
					nombre = nombre-50;
					romain = romain+"L";
					System.out.println("L");
				}
				else if(nombre >= 10) {
					nombre = nombre-10;
					romain = romain+"X";
					System.out.println("X");
				}
				else if(nombre >= 5) {
					nombre = nombre-5;
					romain = romain+"V";
					System.out.println("V");
				}
				else if(nombre >= 1) {
					nombre = nombre-1;
					romain = romain+"I";
					System.out.println("I");
				}
			}
		}
		else System.out.println("Entrez un nombre superieur à 0");
	 return romain;
	}

}
