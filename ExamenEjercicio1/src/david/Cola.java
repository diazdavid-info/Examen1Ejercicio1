package david;

import java.util.concurrent.Semaphore;

public class Cola {
	
	volatile private String pingPong;
	private Semaphore semaphorePoner;
	private Semaphore semaphoreQuitar;
	
	public Cola(){
		semaphorePoner = new Semaphore(1, true);
		semaphoreQuitar = new Semaphore(0, true);
	}
	
	public void accion(){
		
	}
	
	public void setString(String frase){
		semaphorePoner.acquireUninterruptibly();
		pingPong = frase;
		semaphoreQuitar.release();
	}
	
	public void getString(){
		semaphoreQuitar.acquireUninterruptibly();
		System.out.print(pingPong+" ");
		pingPong = null;
		semaphorePoner.release();
	}
}
