///////////////////////
//      TESTING      //
///////////////////////

public class asdf{
    public static void main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        double sockCost$=2.58;                                  //Cost per pair of socks
        //('$' is part of the variable name)
        
        //PA sales tax
        double taxPercent=0.06;
        
        //Cost of each type of item
        double allSocks$=nSocks*sockCost$;                      //Cost of all socks
        
        //Intermediate messy tax per type of item
        double messTaxSocks$=allSocks$*taxPercent;
        
        //Clean up tax
        int cleanTaxSocks$=(int)(messTaxSocks$*100);            //Saves 2 decimal places
        double taxSocks$=(double)cleanTaxSocks$/100;            //(Rounded down)
        
        System.out.println("Item: Socks");
        System.out.println("Quantity: "+nSocks+" Cost per: $"+sockCost$);
        System.out.println("Cost of Socks: $"+allSocks$+" Tax: $"+taxSocks$);
        
        
    }
}
    