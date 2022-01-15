package decoratorpattern.controller;

public abstract class WalletDecorator implements WalletSalesReport{
	private WalletSalesReport decoratedReport;
    
    public WalletDecorator(WalletSalesReport report){
        this.decoratedReport = report;
    }
     
    public String getFirstColumnData() {
        return decoratedReport.getFirstColumnData(); 
    }
     
    @Override
    public Object[][] getReportData(String reportId) {
        return decoratedReport.getReportData(reportId);
    }
}
