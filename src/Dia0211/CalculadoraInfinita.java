package Dia0211;

import java.util.Scanner;

public class CalculadoraInfinita {
	int num1, num2, total = 0;
	public CalculadoraInfinita() {
		
		versao2();
	}
	
	public void versao1()
	{
		do
		{			
			System.out.println("Calculadora Infinita (Insira 0 para sair)");
			
			System.out.println("Insira o primeiro numero");
			num1 = (new Scanner(System.in)).nextInt();
			System.out.println("Insira o segundo numero");
			num2 = (new Scanner(System.in)).nextInt();
			
			if (num2 == 0 || num1 == 0)
			{
				System.out.println("Saiu do programa.");
				System.exit(0);
			}
			
			System.out.println("Insira a operaçao a realizar [+, -, /, *]");
			String oper = (new Scanner(System.in)).nextLine();
			
			switch (oper)
			{
			
			case "+": total = num1 + num2;
				break;
				
			case "-": total = num1 - num2;
				break;
				
			case "*": total = num1 * num2;
				break;
				
			case "/": total = num1 / num2;
				break;
				
			default: System.out.println("Saiu do programa.");
				System.exit(0);
			}

			System.out.println("O resultado é: " + total + "\n\n");
		} while(num1 != 0 || num2 != 0);
	}
	
	public void versao2()
	{
		total = 0;
		System.out.println("Calculadora Infinita Incrementadora (Insira 0 para sair)");
		
		System.out.println("Insira o primeiro numero");
		num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Insira o segundo numero");
		num2 = (new Scanner(System.in)).nextInt();
		
		if (num2 == 0 || num1 == 0)
		{
			System.out.println("Saiu do programa.");
			System.exit(0);
		}
		
		System.out.println("Insira a operaçao a realizar [+, -, /, *]");
		String oper = (new Scanner(System.in)).nextLine();
		
		switch (oper)
		{
		
		case "+": total = num1 + num2;
			break;
			
		case "-": total = num1 - num2;
			break;
			
		case "*": total = num1 * num2;
			break;
			
		case "/": total = num1 / num2;
			break;
			
		default: System.out.println("Saiu do programa.");
			System.exit(0);
		}

		
		do
		{	
			System.out.println("O resultado é: " + total + "\n");
			System.out.println("Insira outro numero para calcular com o resultado:");
			num1 = (new Scanner(System.in)).nextInt();
			if (num1 == 0)
			{
				System.out.println("Saiu do programa.");
				System.exit(0);
			}
			
			System.out.println("Insira a operaçao a realizar [+, -, /, *]");
			oper = (new Scanner(System.in)).nextLine();
			
			switch (oper)
			{
			
			case "+": total += num1;
				break;
				
			case "-": total -= num1;
				break;
				
			case "*": total = num1 * total;
				break;
				
			case "/": total = total / num1;
				break;
				
			default: System.out.println("Saiu do programa.");
				System.exit(0);
			}

			System.out.println("O resultado é: " + total + "\n\n");
		} while(num1 != 0);
	}
}
