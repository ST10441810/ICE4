//ST10441810 PROG5121 ICE Task 4

package ICE4;

// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();
        
        int[] sales = new int[numSalespeople];
        
        final int SALESPEOPLE = 5;
        int sum;
        
        int maxSale = Integer.MIN_VALUE;
        int maxSalePerson = 0;
        
        int minSale = Integer.MAX_VALUE;
        int minSalePerson = 0;
        
        for (int i = 0; i < sales.length; i++){
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        
        for (int i = 0; i < sales.length; i++){
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
            
            if (sales[i] > maxSale){
                maxSale = sales[i];
                maxSalePerson = i;
            }
            
            if (sales[i] < minSale){
                minSale = sales[i];
                minSalePerson = i;
            }
        }
        
        System.out.println("\nTotal sales: " + sum);
        
        double average = (double) sum / SALESPEOPLE;
        System.out.println("Average sales: " + average);
        
        System.out.println("Salesperson " + (maxSalePerson + 1) + " had the highest sale with $" + maxSale + ".");
        
        System.out.println("Salesperson " + (minSalePerson + 1) + " had the lowest sale with $" + minSale + ".");
        
        System.out.print("\nEnter a sales amount to see who exceeded it: ");
        int threshold = scan.nextInt();
        int countExceeding = 0;
        System.out.println("Salespeople who exceeded $" + threshold + ":");
        
        for (int i = 0; i < sales.length; i++){
            if (sales[i] > threshold){
                System.out.println("Salesperson " + (i + 1) + " with sales of $" + sales[i]);
                countExceeding++;
            }
        }
        
        System.out.println("Number of salespeople who exceeded $" + threshold + ": " + countExceeding);
        
    }//End of main
}//End of class