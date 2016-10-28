package Dia2810;
import java.util.Scanner;

public class BalancoGAA {

	int totalDespesas, totalReceitas;
	
	public BalancoGAA() {
		System.out.println("Bom dia, ");
		
		
		int balanco = calcularBalanco(Receitas(), Despesas());
		
		System.out.println("\n\nO saldo é de: " + balanco);
		
		
		if (balanco < 0)
			System.out.println("O saldo é NEGATIVO!");
		else if (balanco > 0)
			System.out.println("O saldo é positivo!");
		else
			System.out.println("O saldo é neutro.");
	}
	
	public int Despesas()
	{
		int agua, 
			luz, 
			telefone, 
			carro;
		
		System.out.println("\nDespesas: ");
		
		System.out.println("Insira o custo da água: ");
		agua = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o custo da luz: ");
		luz = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o custo do telefone: ");
		telefone = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o custo do carro: ");
		carro = (new Scanner(System.in)).nextInt();
		
		totalDespesas = agua + luz + telefone + carro;
		
		return totalDespesas;
		
	}
	
	public int Receitas()
	{
		int quotas, 
			recBaile, 
			recBar;
		
		System.out.println("\nReceitas: ");
		
		System.out.println("Insira a receita das quotas: ");
		quotas = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira a receita do Baile: ");
		recBaile = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira a receita do Bar: ");
		recBar = (new Scanner(System.in)).nextInt();
		
		totalReceitas = quotas + recBaile + recBar;
		
		return totalReceitas;
		
	}
	
	public int calcularBalanco(int receita, int despesa)
	{
		int balanco = receita - despesa;
		
		return balanco;
	}

}
