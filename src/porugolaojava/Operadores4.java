package porugolaojava;

import java.util.Scanner;

public class Operadores4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d, r, s;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		a = leia.nextInt();
		System.out.println("Digite o valor B:");
		b = leia.nextInt();
		System.out.println("Digite o valor C:");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		System.out.println("Valor de R: " + r);
		s = Math.pow((b + c), 2);
		System.out.println("Valor de S: " + s);
		
		d = (r + s) / 2;
		
		System.out.println("O valor da expressão é: " + d);
		
	}

}
