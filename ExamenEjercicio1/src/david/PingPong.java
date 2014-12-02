package david;

public class PingPong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cola cola = new Cola();
		
		Productor productor = new Productor(cola);
		Consumidor consumidor = new Consumidor(cola);
		
		Thread t1, t2;
		
		t1 = new Thread(productor, "productor");
		t2 = new Thread(consumidor, "consumidor");
		
		t1.start();
		t2.start();

	}

}
