/*
*programa que repeteix les paraules
*/
public class Lloro {
	public static void main(String [] args) {
	
	
	System.out.println("El lloro pregunta paraula:");
	String paraula = Entrada.readLine();
	
	while (!(paraula.isBlank())){
		System.out.println("El lloro diu: " + paraula);
		System.out.println("El lloro pregunta paraula:");
		paraula = Entrada.readLine();
	}
	System.out.println("Adéu");
	}
  }