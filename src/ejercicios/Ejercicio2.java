package ejercicios;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		//Pedimos número hasta que sea positivo,
		do {
		System.out.println("Introduce un número ");
		numero = sc.nextInt();
		}while (numero < 0);			
		//Escribimos los 20 números siguientes
		for (int i = numero + 1; i < numero + 21; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
