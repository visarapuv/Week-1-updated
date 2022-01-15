package decoratorpattern.controller;

public class SupportLinkDecorator extends WalletDecorator {
	public SupportLinkDecorator(WalletSalesReport report) {
        super(report);
    }
 
    public String getFirstColumnData() {
        return addMoreInfo (super.getFirstColumnData()) ;
    }
     
    private String addMoreInfo(String data){
        return data  + " - support link - ";
    }
}
