package decoratorpattern.controller;

public class SupportReport implements WalletSalesReport{

	@Override
	public Object[][] getReportData(String reportId) {
		
		return null;
	}

	@Override
	public String getFirstColumnData() {
		
		return "Support Data";
	}
	
}
