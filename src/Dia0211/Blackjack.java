package Dia0211;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
	int carta, pontosJogador = 0, pontosDealer = 0, valorCarta;
	boolean vezJogador = true, figuraJogador = false, figuraDealer = false;
	final int VALORMAX = 12;
	
	public Blackjack() {
		
		// Introdução
		System.out.println("Jogo do BLACKJACK\n");
		System.out.print("Pressione uma tecla para iniciar...");
		(new Scanner(System.in)).nextLine();
		
		
		while(pontosJogador <= 21 || pontosDealer <= 21)
		{
			// Gerar carta 
			Random r = new Random();
			carta = r.nextInt(VALORMAX);
			
			if (vezJogador)
			{
				System.out.println("Vez do Jogador");
			}
			else
			{
				System.out.println("Vez do Dealer");
			}
			
			System.out.println("A gerar carta...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			
			}
			
			// Determina valor da carta 
			switch (carta)
			{
			case 0: //CARTA ÁS - 11 pontos
				if (vezJogador && !figuraJogador)
					valorCarta = 1;
				else if (!vezJogador && !figuraDealer)
					valorCarta = 1;
				else
					valorCarta = 11;
				System.out.println("Saiu a carta Ás.");
				break;
			case 1: //Carta 2 - 2 pontos
				valorCarta = 2;
				System.out.println("Saiu a carta 2.");
				break;
			case 2: //Carta 3 - 3 pontos
				valorCarta = 3;
				System.out.println("Saiu a carta 3.");
				break;
			case 3: //Carta 4 - 4 pontos
				valorCarta = 4;
				System.out.println("Saiu a carta 4.");
				break;
			case 4: //Carta 5 - 5 pontos
				valorCarta = 5;
				System.out.println("Saiu a carta 5.");
				break;
			case 5: //Carta 6 - 6 pontos
				valorCarta = 6;
				System.out.println("Saiu a carta 6.");
				break;
			case 6: //Carta 7 - 7 pontos
				valorCarta = 7;
				System.out.println("Saiu a carta 7.");
				break;
			case 7: //Carta 8 - 8 pontos
				valorCarta = 8;
				System.out.println("Saiu a carta 8.");
				break;
			case 8: //Carta 9 - 9 pontos
				valorCarta = 9;
				System.out.println("Saiu a carta 9.");
				break;
			default: //Carta 10 (9), Valete(10), Dama(11), Rei(12) - 10 pontos
				valorCarta = 10;
				if(carta == 9)
					System.out.println("Saiu a carta 10.");
				else if(carta == 10)
				{
					if (vezJogador && !figuraJogador)
						figuraJogador = true;
					else if (!vezJogador && !figuraDealer)
						figuraDealer = true;
					System.out.println("Saiu a carta Valete.");
				}
				else if(carta == 11)
				{
					if (vezJogador && !figuraJogador)
						figuraJogador = true;
					else if (!vezJogador && !figuraDealer)
						figuraDealer = true;
					System.out.println("Saiu a carta Dama.");
				}
				else
				{
					if (vezJogador && !figuraJogador)
						figuraJogador = true;
					else if (!vezJogador && !figuraDealer)
						figuraDealer = true;
					System.out.println("Saiu a carta Rei.");
				}
				break;
			}
			
			// Altera a vez
			if (vezJogador)
			{
				pontosJogador += valorCarta;
				vezJogador = false;
			}
			else
			{
				pontosDealer += valorCarta;
				vezJogador = true;
			}
			
			System.out.println("\nTem agora: " + pontosJogador + " pontos.");
			System.out.println("Dealer tem : " + pontosDealer + " pontos.");
			System.out.println("Pressione ENTER para continuar...");
			System.out.println("__________________________________________");
			
			(new Scanner(System.in)).nextLine();
			
			// Verifica se há vencedor
			if (pontosJogador > 21)
			{
				System.out.println("Perdeu! Excedeu os 21 pontos, tem " + pontosJogador + " pontos...");
				System.exit(0);
			}
			else if (pontosJogador == 21)
			{
				System.out.println("GANHOU! BLACKJACK! TEM 21 PONTOS!");
				System.exit(0);
			}
			else if (pontosDealer > 21)
			{
				System.out.println("GANHOU! O dealer excedeu os 21 pontos.");
				System.exit(0);
			}
			else if (pontosDealer == 21)
			{
				System.out.println("Perdeu! O dealer conseguiu um Blackjack."); 
				System.exit(0);
			}
			
		}
		
	}

}
