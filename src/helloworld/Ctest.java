package helloworld;

public class Ctest {

	public static void main(String[] args) {
		
		WStestService factory = new WStestService();
		WStest ws = factory.getWStestPort();
		ws.hello();
	}
}
