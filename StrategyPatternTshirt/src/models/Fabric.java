/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author BILLYS
 */
public enum Fabric {
    WOOL(1.4f), COTTON(1.5f),  POLYESTER(1.6f),  RAYON(1.7f),  LINEN(1.8f),  CASHMERE(1.9f),  SILK(2f);
    
    private final float unitPrice;
     Fabric(float unitPrice)
    {
        this.unitPrice=unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
    
}
