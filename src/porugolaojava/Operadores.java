package porugolaojava;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, mes, dia;
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva a sua idade: ");
		idade = leia.nextInt();
		mes = idade * 12;
		dia = mes * 30;
		
		System.out.println("Idade: " + idade + "\nMeses: " 
		+ mes + "\nDias: " + dia);

	}

}
