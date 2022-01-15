package observerpattern.controller;

public class TestMain {

	public static void main(String[] args) {
		WaterProof w1 = new WaterProof();
        BiFold w2 = new BiFold();
        Aluminium w3 = new Aluminium();
         
        WalletManufacturer wm = new WalletManufacturer();
         
        wm.attach(w1);
        wm.attach(w2);
         
        wm.notifyUpdate(new Wallet("First Message"));   //s1 and s2 will receive the update
         
        wm.detach(w1);
        wm.attach(w3);
         
        wm.notifyUpdate(new Wallet("Second Message")); //s2 and s3 will receive the update

	}

}
