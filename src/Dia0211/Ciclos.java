package Dia0211;

public class Ciclos {

	String msg = "All you need is love,";
	
	public Ciclos() {
		
		dePara();

		System.out.println("Love is all you need.");
	}
	
	public void enquanto()
	{
		int i = 0;
		
		
		
		while (i < 3)
		{
			System.out.println(msg);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i++;
		}
	}
	
	public void fazerEnquanto()
	{
		int i = 1;
		
		do
		{
			System.out.println(msg);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i++;
		} while (i <= 3);
	}
	
	public void dePara()
	{
		for (int i = 1; i <= 3; i++)
		{
			System.out.println(msg);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
