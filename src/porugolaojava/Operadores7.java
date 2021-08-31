package porugolaojava;

import java.util.Scanner;

public class Operadores7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c, d, eh, f, x, y;		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextFloat();
		System.out.println("Digite o valor de B: ");
		b = leia.nextFloat();
		System.out.println("Digite o valor de C: ");
		c = leia.nextFloat();
		System.out.println("Digite o valor de D: ");
		d = leia.nextFloat();
		System.out.println("Digite o valor de E: ");
		eh = leia.nextFloat();
		System.out.println("Digite o valor de F: ");
		f = leia.nextFloat();
		
		x = ((c * eh) - (b - f)) / ((a * eh) - (b * d));
		System.out.println("O valor de X é: " + x);
		
		y = ((a*f) - (c * d)) / ((a * eh) - (b * d));
		System.out.println("O valor de Y é: " + y);

	}

}
