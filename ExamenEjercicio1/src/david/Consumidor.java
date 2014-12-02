package david;

public class Consumidor implements Runnable{
	
	private Cola cola;
	
	public Consumidor(Cola cola){
		 this.cola = cola;
	}
	
	public void run(){
		while(true){
			cola.getString();
		}
	}

}
