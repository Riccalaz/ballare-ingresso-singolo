package discotecas;

import java.util.Random;

public class thread extends Thread{
	private cp contatore;
	
	public thread(cp c){
		contatore=c;
	}
	
	public void run() {
		Random ran = new Random();
		
		
		while(true) {
			contatore.entra();  //incremento il contatore per simulare l'entrata
			try {
				Thread.sleep(ran.nextInt(700)+100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contatore.esce(); //decremento il contatore per simulare l'entrata
			try {
				Thread.sleep(ran.nextInt(700)+100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
