package discotecas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("inserisci n di persone: ");
		
		int T = myObj.nextInt(); //inserimento numero thread
		thread[] th=new thread[T]; //arrey di thread
		cp c=new cp(); //contatore per gli ingressi
		
		for(int i=0;i<T;i++){
			th[i]= new thread(c);
			th[i].start(); 
		}
		
		while(true) {
			System.out.println("persone in discoteca: "+ c.getc()); //stampo a schermo il contatore
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
