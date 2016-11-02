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
		 *  =  -> Atribui��o
		 *  == -> Compara��o (true ou false)
		 *  != -> Compara��o
		 */
		if (num1 == num2)
		{
			System.out.println("Os n�meros s�o iguais.");
		}
		else if (num1 < num2)
		{
			System.out.println("O n�mero 1 � menor que o n�mero 2.");
		}
		else
		{
			System.out.println("O n�mero 1 � maior que o n�mero 2.");
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
			System.out.println("O n�mero 1 � maior");
		}
		if (num1 > num2 && num1 > num3 && num1 > num4)
		{
			System.out.println("O n�mero 1 � o maior de todos");
		}
		
		if (num2 > num3 || num1 > num4)
		{
			System.out.println("Ganha a equipa 1");
		}
		else
			System.out.println("Ganha a equipa 2");
	}

}
