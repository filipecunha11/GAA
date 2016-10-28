package Dia2810;
import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
		int num1, num2, total;
		
		System.out.println("Introduza o primeiro número");
		num1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza o segundo número");
		num2 = (new Scanner(System.in)).nextInt();
		
		total = num1 + num2;
		
		System.out.println("Resultado: " + total);
	}

}
