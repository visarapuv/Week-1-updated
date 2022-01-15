package observerpattern.controller;

public class Aluminium implements Observer{

	@Override
	public void update(Wallet w) {
		System.out.println("Aluminium wallet is in stock");
		
	}
	
}
