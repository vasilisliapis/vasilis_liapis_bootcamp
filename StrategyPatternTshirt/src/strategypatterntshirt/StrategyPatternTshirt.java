/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterntshirt;

import Interfaces.IPayment;
import models.Color;
import models.Fabric;
import models.Size;
import models.Tshirt;

/**
 *
 * @author BILLYS
 */
public class StrategyPatternTshirt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Tshirt tshirt=new Tshirt("MARCO POLO",Color.RED,Size.XS,Fabric.WOOL);
//        Fabric f =Fabric.WOOL;
//        for(Fabric fa : Fabric.values())
//        {
//            System.out.println(fa);
//        }
//        System.out.println(f.getUnitPrice());
        IPayment payment1 =new CreditDebitCard();
        IPayment payment2 =new MoneyBankTransfer();
        IPayment payment3 =new CashTransfer();
        StrategyPatternTshirt myMainClass = new StrategyPatternTshirt();
        int count=0;
        for(Color c:Color.values())
        {
            for(Fabric f:Fabric.values())
            {
                for(Size s:Size.values())
                {
                    count++;
                    String name="Tshirt"+count;
                    System.out.println("Product: "+name+" will cost :");
                    Tshirt tshirt=new Tshirt(name,c,s,f);
                    myMainClass.makeAnOrder(tshirt, payment1);
                    System.out.println("");
                    myMainClass.makeAnOrder(tshirt, payment2);
                    System.out.println("");
                    myMainClass.makeAnOrder(tshirt, payment3);
                    System.out.println("");
                }
            }
        }

    }
    public void makeAnOrder(Tshirt tshirt,IPayment payment){
        float fp=tshirt.getFabric().getUnitPrice();
        float cp=tshirt.getColor().getColorPriceFactor();
        float sp=tshirt.getSize().getSizePriceFactor();
        if(payment instanceof CreditDebitCard)
        {
            payment.pay(fp*cp*sp*7+5);
        }
        else if(payment instanceof MoneyBankTransfer)
        {
            payment.pay(fp*cp*sp*7+3);
        }
        else if(payment instanceof CashTransfer)
        {
            payment.pay(fp*cp*sp*7+1);
        }
        
    }
}
