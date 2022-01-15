package observerpattern.controller;

import java.util.ArrayList;
import java.util.List;

public class WalletManufacturer implements Subject{

	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void attach(Observer o) {
		 observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(Wallet w) {
		for(Observer o: observers) {
            o.update(w);
        }
		
	}

}
