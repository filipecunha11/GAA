package Dia2810;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNum {
	int escondido;
	final int VALORMAX = 5;
	
	public AdivinhaNum() {
		Random r = new Random();
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
		
		System.out.println("\n\nAcertou! O escondidinho é " + escondido);
		
	}

	public void tentarAdivinhar()
	{
		int tent;
		
		System.out.println("Insira um número para tentar adivinhar o escondidinho:");
		tent = (new Scanner(System.in)).nextInt();
		if (tent != escondido)
		{
			do
			{
				System.out.println("\nErrou, tente novamente:");
				tent = (new Scanner(System.in)).nextInt();
			}
			while (tent != escondido);
		}
	}
}
