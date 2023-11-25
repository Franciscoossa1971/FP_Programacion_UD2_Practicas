package ejercicios;

public class Ejercicio3 {
	public static void main(String [] args) {
		int contador=0;
						
		System.out.println("Números múltiplos de 2 o de 3");
		for(int i=0;i<=100;i++) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
				contador++;
			}			
		}
		System.out.println();
		System.out.println("Hay "+contador+" múltiplos de 2 o de 3");
		System.out.println();			
	}	
}
