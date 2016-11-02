package Dia0211;

public class Condicionais {

	public Condicionais() {
		comparadorMultiVariavel();
		//comparadorSimples();
	}
	
	public void comparadorSimples()
	{
		int num1 = 3;
		int num2 = 4;
		
		/*
		 *  =  -> Atribuição
		 *  == -> Comparação (true ou false)
		 *  != -> Comparação
		 */
		if (num1 == num2)
		{
			System.out.println("Os números são iguais.");
		}
		else if (num1 < num2)
		{
			System.out.println("O número 1 é menor que o número 2.");
		}
		else
		{
			System.out.println("O número 1 é maior que o número 2.");
		}
	}
	
	public void comparadorMultiVariavel()
	{
		int num1 = 5,
			num2 = 7,
			num3 = 3,
			num4 = 8;
		

		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O número 1 é maior");
		}
		if (num1 > num2 && num1 > num3 && num1 > num4)
		{
			System.out.println("O número 1 é o maior de todos");
		}
		
		if (num2 > num3 || num1 > num4)
		{
			System.out.println("Ganha a equipa 1");
		}
		else
			System.out.println("Ganha a equipa 2");
	}

}
