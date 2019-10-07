package simplified;

public class HtmlFormatter extends Invoice implements InvoiceFormatter
{
	public String formatHeader()
	   {
	      total = 0;
	      String invoiceHeader = new String("<b><h1 style = 'color: green'; align = 'center' >"+ "INVOICE" + "</h1></b>"); 
	      return invoiceHeader;
	   }

	   public String formatLineItem(LineItem item)
	   {
	      double hammerCost = 19.95*Invoice.getHammerCount();
	      double bundleCost = 26.91*Invoice.getBundleCount();
	      total = hammerCost + bundleCost;
	      String hammer = new String("<li><p style = 'color: orange'>" + "Hammer: " + String.format("%.2f", hammerCost) + "  x" + Invoice.getHammerCount() + "</p></li>");
	      String bundle = new String("<li><p style = 'color: orange'>" + "\nBundle: Hammer, Assorted Nails (Discount 10.0%): " + String.format("%.2f", bundleCost) + "  x" + Invoice.getBundleCount() + "</p></li>");
	      return hammer + bundle;
	   }

	   /*
	    * return ("Hammer: " + (19.95*invoice.getHammerCount) + "  x" + invoice.getHammerCount
	    * 		  "Bundle: Hammer, Assorted Nails (Discount 10.0%):" + (26.91*invoice.getBundleCount) + "  x" + invoice.getBundleCount);
	    */
	   
	   public String formatFooter()
	   {
		  String invoiceFooter = new String("<b><p style = 'color: red'>"+ "TOTAL DUE:" + "</p><b>" + "<p style = 'color: blue'>" + String.format("%.2f", total) + "<br></p>");
		  return invoiceFooter;
	   }

	   private double total;
}
