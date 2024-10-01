package discotecas;

public class cp {
	private int c;
	
	public cp() {
		c=0;
	}
	
	public synchronized void entra(){
		c++;
	}

	public synchronized void esce() {
		c--;
	}
	
	public int getc() {
		return c;
	}
}
