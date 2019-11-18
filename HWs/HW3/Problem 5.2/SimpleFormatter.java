package simplified;
/**
   A simple invoice formatter.
*/
public class SimpleFormatter  extends Invoice implements InvoiceFormatter
{
   public String formatHeader()
   {
      total = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getPrice();
      double hammerCost = 19.95*Invoice.getHammerCount();
      double bundleCost = 26.91*Invoice.getBundleCount();
      return ("Hammer: " + String.format("%.2f", hammerCost) + "  x" + Invoice.getHammerCount() + 
    		  "\nBundle: Hammer, Assorted Nails (Discount 10.0%):" + String.format("%.2f", bundleCost) + "  x" + Invoice.getBundleCount());
   }

   /*
    * return ("Hammer: " + (19.95*invoice.getHammerCount) + "  x" + invoice.getHammerCount
    * 		  "Bundle: Hammer, Assorted Nails (Discount 10.0%):" + (26.91*invoice.getBundleCount) + "  x" + invoice.getBundleCount);
    */
   
   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
}
