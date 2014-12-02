package david;

public class Productor implements Runnable{
	
	private boolean pingPong = true;
	private Cola cola;
	
	public Productor(Cola cola){
		this.cola = cola;
	}
	
	public void run(){
		while(true){
			if(pingPong){
				cola.setString("PING");
				pingPong = false;
			}else{
				cola.setString("PONG");
				pingPong = true;
			}
		}
	}

}
