package porugolaojava;

import java.util.Scanner;

public class Operadores2 {
	
	public static void main(String[] args) {
		int idade, dia, mes, resto;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva quatos dias você tem de vida: ");
		dia = leia.nextInt();
		
		idade = dia / 365;
		resto = dia % 365;
		mes = resto / 30;
		dia = resto % 30;
		
		System.out.println("Idade: " + idade + "\nMeses: " 
				+ mes + "\nDias: " + dia);
	}
}
