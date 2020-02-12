
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the amount of your purchase:");
    double Amount = keyboard.nextDouble();
    double StateTaxRate = 0.04;
    double CountyTaxRate = 0.02;
    System.out.println("The amount is " + Amount);
    double StateTax = (StateTaxRate * Amount);
    double CountyTax = (CountyTaxRate * Amount);
    double SalesTaxTotal = (StateTax + CountyTax);
    double TotalSale = (Amount + SalesTaxTotal);
    double StateTaxRoundoff = Math.round(StateTax * 100.0) / 100.0;
    double CountyTaxRoundoff = Math.round(CountyTax * 100.0) / 100.0;
    double SalesTaxTotalRoundoff = Math.round(SalesTaxTotal * 100.0) / 100.0;
    double TotalSaleRoundoff = Math.round(TotalSale * 100.0) / 100.0;
    System.out.println("The state tax is: " + StateTaxRoundoff);
    System.out.println("The county tax is: " + CountyTaxRoundoff);
    System.out.println("The total sales tax is: " + SalesTaxTotalRoundoff);
    System.out.println("The total of this sale is: " + TotalSaleRoundoff);
    
    
   
    
    
            
    }
}
