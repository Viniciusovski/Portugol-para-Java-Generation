package porugolaojava;

import java.util.Scanner;

public class Operadores8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float custo_carro_novo, custo_fabrica, percent_distribuidor, percent_impostos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica do carro:");
		custo_fabrica = leia.nextFloat();
		
		percent_distribuidor = custo_fabrica * 1.28f;
		percent_impostos = custo_fabrica * 1.45f;
		custo_carro_novo = percent_distribuidor + percent_impostos;
		System.out.println("O valor do carro novo é: " + custo_carro_novo);

	}

}
