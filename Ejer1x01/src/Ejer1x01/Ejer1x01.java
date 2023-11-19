package Ejer1x01;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1x01 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		int [] dieznumeros = new int [10];
		
		for(int i=0;i<dieznumeros.length;i++) {
			System.out.println("Dame un número entero");
			dieznumeros [i] = teclado.nextInt();
		}
		
		
		
		System.out.println("VECTOR: " + Arrays.toString(dieznumeros));
		
		int [] copia = Arrays.copyOf(dieznumeros, dieznumeros.length);
		
		Arrays.sort(copia);
		
		System.out.println("Mínimo: " + copia[0]);
		
		for (int i=0;i<10;i++) {
			if (dieznumeros[i]==copia[0]) {
				System.out.println("Primera posición del mínimo: " + (i+1));
			}
		}
		
		System.out.println("Máximo: " + copia[copia.length-1]);
		
		for (int i=0;i<10;i++) {
			if (dieznumeros[i]==copia[9]) {
				System.out.println("Primera posición del mínimo: " + (i+1));
			}
		}
		
		
		
	}

}
