package decoratorpattern.controller;

public class SupportPopupDecorator extends WalletDecorator{
 
    public SupportPopupDecorator(WalletSalesReport report) {
        super(report);
    }
 
    public String getFirstColumnData() {
        return addPopup (super.getFirstColumnData()) ;
    }
     
    private String addPopup(String data){
        return data  + " - support popup - ";
    }
}