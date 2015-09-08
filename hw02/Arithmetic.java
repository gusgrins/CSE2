// Gustavo Grinsteins
// CSE 002 - section 310 HW02
// 09/01/2015
// Arithmetic Java program

/* Purpose:

    Compute the cost of items bought, including the PA 6% sakes tax.
    
Learning Outcomes: 

*manipulate data stored in variables
*run simple calculations
*print numerica output generated

*/


// define a class
public class Arithmetic 
{
    
// add a main method
    public static void main(String[] args)
    {
        //The tax variable was moved in order to calculate
        //the sales tax for each item
        double taxPercent = 0.06;
        
        //Number of pairs of socks
        int nSocks = 3;
        
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$ = 2.58;
        
        //Total cost for Socks
		//type of variable declaration
		double totalSockCost$;
        totalSockCost$ = nSocks * sockCost$;
        
        //Sales Tax on socks
		//type of variable declaration
		double taxSock;
        taxSock = totalSockCost$ * taxPercent;
        
        //Number of drinking glasses
        int nGlasses = 6;
        
        //Cost per glass
        double glassCost$ = 2.29;
        
        //Total cost for glasses
		//type of variable declaration
		double totalGlassCost$;
        totalGlassCost$ =  nGlasses * glassCost$;
        
        //Sales Tax on glasses
		//type of variable declaration
		double taxGlass;
        taxGlass = totalGlassCost$ * taxPercent;
        
        //Number of boxes of envelopes
        int nEnvelopes = 1;
        
        //cost per box of envelopes
        double envelopeCost$ = 3.25;
        
        //Total cost for envelopes
		//type of variable declaration
		double totalEnvelopeCost$;
        totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
        
        //Sales Tax on envelopes
		//type of variable declaration
		double taxEnvelope;
        taxEnvelope = totalEnvelopeCost$ * taxPercent;
        
        //Total Cost of Purchase before taxes
		//type of variable declaration
		double noTaxTotal;
        noTaxTotal = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
        
        //Total Sales Tax
        //Declaration of variable type
        double totalSalesTax;
        totalSalesTax = noTaxTotal * taxPercent;
        
        //Total Cost of purchase after taxes
        //type of variable declaration
		double yesTaxTotal;
        yesTaxTotal = noTaxTotal + (noTaxTotal * taxPercent);
		
	
		//Print statements
		
		//I will print a couble of extra empty lines 
		//to make the list easier to read
		System.out.println();
		//item being bought
		System.out.println("Socks");
		//quantity of item being bought
		System.out.println("Number of Socks = " + nSocks);
		//Cost of the item
		System.out.println("Cost per Sock = " + sockCost$);
		//Total cost of item
		System.out.println("Total Sock Cost = " + totalSockCost$);
		//sales tax on item
		// System.out.printf: lets you declare how  many decimal places you want
		// in you numbers
		// %n: works the smae way as println but you can use it will using the 
		// printf function
		System.out.printf("Sales tax of socks = %.2f %n", taxSock);
		System.out.println();
		//item being bought
		System.out.println("Glasses");
		//quantity of item being bought
		System.out.println("Number of Glasses = " + nGlasses);
		//Cost of the Item
		System.out.println("Cost per Glass = " + glassCost$);
		//Total cost of item
		System.out.println("Total Glass Cost = " + totalGlassCost$);
		//sales tax on item
		System.out.printf("Sales tax of Glasses = %.2f %n", taxGlass);
		System.out.println();
		//item being bought
		System.out.println("Envelopes");
		//quantity of item being bought
		System.out.println("Number of Envelopes = " + nEnvelopes);
		//Cost of the Item
		System.out.println("Cost per Envelopes = " + envelopeCost$);
		//Total cost of item
		System.out.println("Total Envelope Cost = " + totalEnvelopeCost$);
		//sales tax on item
		System.out.printf("Sales tax of Envelopes = %.2f %n ", taxEnvelope);
		System.out.println();
		//total cost of purchase before tax
		System.out.println("Total Cost without tax = " + noTaxTotal);
		//total sales tax
		System.out.printf("Total Sales Tax = %.2f %n", totalSalesTax);
		//total cost of purchase after tax
		System.out.printf("Total Cost With tax = %.2f %n ", yesTaxTotal);
		System.out.println();
		
    }
}