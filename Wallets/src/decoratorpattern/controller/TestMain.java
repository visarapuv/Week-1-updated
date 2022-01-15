package decoratorpattern.controller;

public class TestMain {
	public static void main(String[] args) {
        
                 
        SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecoratored.getFirstColumnData());
    }
}
