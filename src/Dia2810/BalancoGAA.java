package Dia2810;
import java.util.Scanner;

public class BalancoGAA {

	int totalDespesas, totalReceitas;
	
	public BalancoGAA() {
		System.out.println("Bom dia, ");
		
		Despesas();
		Receitas();
		
		System.out.println("O saldo final �: " + (totalReceitas - totalDespesas));
	}
	
	public void Despesas()
	{
		int agua, luz, telefone, carro;
		
		System.out.println("Insira o custo da �gua: ");
		agua = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o custo da luz: ");
		luz = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o custo do telefone: ");
		telefone = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o custo do carro: ");
		carro = (new Scanner(System.in)).nextInt();
		
		totalDespesas = agua + luz + telefone + carro;
		
		System.out.println("O total de despesas �: " + totalDespesas);
		
	}
	
	public void Receitas()
	{
		int quotas, recBaile, recBar;
		
		System.out.println("Insira a receita das quotas: ");
		quotas = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira a receita do Baile: ");
		recBaile = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira a receita do Bar: ");
		recBar = (new Scanner(System.in)).nextInt();
		
		totalReceitas = quotas + recBaile + recBar;
		
		System.out.println("O total de receitas �: " + totalReceitas);
		
	}

}
