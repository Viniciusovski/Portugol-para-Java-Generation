package porugolaojava;

import java.util.Scanner;

public class Operadores5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, media;
		float ponderada1, ponderada2, ponderada3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva a sua primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Escreva a sua segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Escreva a sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		ponderada1 = nota1 * 2;
		ponderada2 = nota2 * 3;
		ponderada3 = nota3 *5;
		
		media = (ponderada1 + ponderada2 + ponderada3) / 10;
		System.out.println("A média ponderada é: " + media);

	}

}
