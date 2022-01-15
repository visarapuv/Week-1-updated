package decoratorpattern.controller;

public interface WalletSalesReport {
	public Object[][] getReportData(final String reportId);
    public String getFirstColumnData();
}
