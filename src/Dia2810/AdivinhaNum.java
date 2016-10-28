package Dia2810;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNum {
	int escondido, i = 3;
	final int VALORMAX = 10;
	
	public AdivinhaNum() {
		Random r = new Random();
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
		
		if (i > 0)
			System.out.println("\n\nACERTOU! O escondidinho é " + escondido);
		else
			System.out.println("\n\nAcabaram as tentativas... O escondidinho era " + escondido);
		
	}

	public void tentarAdivinhar()
	{
		int tent;
		
		System.out.println("Insira um número para tentar adivinhar o escondidinho (0-" + VALORMAX + "):");
		tent = (new Scanner(System.in)).nextInt();
		while (tent != escondido && i > 0)
		{
			i--;
			if(tent > escondido)
				System.out.println("\nO escondido é menor que " + tent);
			else
				System.out.println("\nO escondido é maior que " + tent);
			
			System.out.println(i + " tentativas.");
			System.out.println("Tente novamente:");
			
			tent = (new Scanner(System.in)).nextInt();
		}
	}
}
