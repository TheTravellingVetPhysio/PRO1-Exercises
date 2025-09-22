package session1_intro;

public class SalesTaxExample
{
  public static void main(String[] args)
  {
    int num1 = 19;
    int num2 = 89;

    double salesTaxRate = 0.25;

    double salesTax1 = num1 * salesTaxRate;
    System.out.println("SalesTax:" + salesTax1);

    double salesTax2 = num2 * salesTaxRate;
    System.out.println("SalesTax:" + salesTax2);
  }
}
