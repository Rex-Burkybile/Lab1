/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.lab1;

import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 0800490
 */
public class SalesTax {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "Please enter purchase amount");
        String purchasePriceAsString = JOptionPane.showInputDialog("Purchase amount");
        float purchasePriceAsFloat = Float.parseFloat(purchasePriceAsString);
        
        
        float countryTaxRate = .02F;
        float stateTaxRate = .04F;
        
        float countrySalesTax = purchasePriceAsFloat * countryTaxRate;
        float stateSalesTax = purchasePriceAsFloat * stateTaxRate;
        
        float totalSalesTax = countrySalesTax + stateSalesTax;
        float totalOfSale = purchasePriceAsFloat + totalSalesTax;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("The amount before tax is " + money.format (purchasePriceAsFloat) + " the state tax is " + 
               money.format (stateSalesTax) + " the country sales tax is " + money.format (countrySalesTax) + " the total sales tax is " 
        + money.format (totalSalesTax) + " the total price of sale is " + money.format (totalOfSale));
        
    }
}
