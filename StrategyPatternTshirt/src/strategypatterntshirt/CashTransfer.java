/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterntshirt;

import Interfaces.IPayment;

/**
 *
 * @author BILLYS
 */
public class CashTransfer implements IPayment{

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made via Cash",amount);
        return(true);
    }
    
}
