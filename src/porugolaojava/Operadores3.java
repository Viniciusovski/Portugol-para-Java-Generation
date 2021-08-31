package porugolaojava;

import java.util.Scanner;

public class Operadores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundos, minutos, horas, resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual foi o tempo em segundos do evento?:");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		resto = segundos % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println("O evento durou, " + horas + " horas, " + minutos + " minutos, e "+ segundos + "segundos.");

	}

}
