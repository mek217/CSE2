////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//Hw 02
//Arithmetic Program
//
//Objective:
//Display the item, quantity of each item, and cost per each item
//Display cost per type of item, and sales tax per type of item
//Display total cost before tax, total sales tax, and total cost including tax
//
// 
//Define a class
public class Arithmetic{
    
    //Add a main method
    public static void main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        double sockCost$=2.58;                                  //Cost per pair of socks
        //('$' is part of the variable name)
        
        //Number of drinking glasses
        int nGlasses=6;
        double glassCost$=2.29;                                 //Cost per glass
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        double envelopeCost$=3.25;                              //Cost per box of envelopes
        
        //PA sales tax
        double taxPercent=0.06;
        
        //Cost of each type of item
        double allSocks$=nSocks*sockCost$;                      //Cost of all socks
        double allGlasses$=nGlasses*glassCost$;                 //Cost of all glasses
        double allEnvelopes$=nEnvelopes*envelopeCost$;          //Cost of all envelopes
        
        //Intermediate messy tax per type of item
        double messTaxSocks$=allSocks$*taxPercent;
        double messTaxGlasses$=allGlasses$*taxPercent;
        double messTaxEnvelopes$=allEnvelopes$*taxPercent;
        
        //Clean up tax
        int cleanTaxSocks$=(int)(messTaxSocks$*100);            //Saves 2 decimal places
        double taxSocks$=(double)cleanTaxSocks$/100;            //(Rounded down)
        
        int cleanTaxGlasses$=(int)(messTaxGlasses$*100);
        double taxGlasses$=(double)cleanTaxGlasses$/100;
        
        int cleanTaxEnvelopes$=(int)(messTaxEnvelopes$*100);
        double taxEnvelopes$=(double)cleanTaxEnvelopes$/100;
        
        //Calculate cost of all items, all tax, and items+tax
        double allItems$=allSocks$+allGlasses$+allEnvelopes$;
        double allTax$=taxSocks$+taxGlasses$+taxEnvelopes$;
        double totalCost$=allItems$+allTax$;
        
        System.out.println("Item: Socks");
        System.out.println("Quantity: "+nSocks+" Cost per: $"+sockCost$);
        System.out.println("Item: Glasses");
        System.out.println("Quantity: "+nGlasses+" Cost per: $"+glassCost$);
        System.out.println("Item: Envelopes");
        System.out.println("Quantity: "+nEnvelopes+" Cost per: $"+envelopeCost$);
        System.out.println("Cost of Socks: $"+allSocks$+" Tax: $"+taxSocks$);
        System.out.println("Cost of Glasses: $"+allGlasses$+" Tax: $"+taxGlasses$);
        System.out.println("Cost of Envelopes: $"+allEnvelopes$+" Tax: $"+taxEnvelopes$);
        System.out.println("Cost of all items: $"+allItems$+" Cost of all tax: $"+allTax$);
        System.out.println("Total cost including tax: $"+totalCost$);
        
    }
}

