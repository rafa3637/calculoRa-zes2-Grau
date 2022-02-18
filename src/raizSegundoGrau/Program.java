package raizSegundoGrau;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C; 
		double De, X1, X2;
		
		
		System.out.print("Digite os membros da equação do segundo grau: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		De = (Math.pow(B, 2) - 4 * A * C);
		
		X1 = ((-B + (Math.sqrt(De)))/(2 * A));
		X2 = ((-B - (Math.sqrt(De)))/(2 * A));
		
		System.out.print("Primeira raiz = " + X1);
		System.out.print("\nSegunda raiz = " + X2);
		
		sc.close();

	
	}

}
