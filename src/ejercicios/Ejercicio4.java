package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1,numero2,numero3;		
		int aux,opcion;
		//Pedimos los números
		System.out.println("Introduce 3 números ");
		System.out.println("Número 1");
		numero1 = sc.nextInt();
		System.out.println("Número 2");
		numero2 = sc.nextInt();
		System.out.println("Número 3");
		numero3 = sc.nextInt();
		System.out.println();
		
		// Ordenar los números
		if(numero1<numero2) {
			aux=numero2;
			numero2=numero1;
			numero1=aux;
		}
		if(numero2<numero3) {
			aux=numero2;
			numero2=numero3;
			numero3=aux;
		}
		if(numero1<numero2) {
			aux=numero2;
			numero2=numero1;
			numero1=aux;
		}
		//Preguntamos el orden a presentar
		do{
			System.out.println("¿Como quieres que se muestren los números?");
			System.out.println("1.- Ascendente (de menor a mayor)");
			System.out.println("2.- Descendiente (de mayor a menor)");
			System.out.println("Elija su opcion ");
			opcion = sc.nextInt();
		} while (opcion != 1 & opcion != 2);

		switch (opcion) {
		case 1:
			System.out.println(numero3+","+numero2+","+numero1);
			break;
		case 2:
			System.out.println(numero1+","+numero2+","+numero3);
			break;				
		}		
		sc.close();
	}
}
