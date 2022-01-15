package observerpattern.controller;

public class Wallet {
	final String walletContent;

	public Wallet(String walletContent) {
		super();
		this.walletContent = walletContent;
	}

	public String getWalletContent() {
		return walletContent;
	}
	
}
