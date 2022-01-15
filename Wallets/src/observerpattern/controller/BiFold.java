package observerpattern.controller;

public class BiFold implements Observer{

	@Override
	public void update(Wallet w) {
		System.out.println("BiFold wallet is in stock");
		
	}
	
}
