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
public enum Size {
    XS(1f),S(1.3f),M(1.4f),L(1.5f),XL(1.6f),XXL(1.7f),XXXL(1.8f);
    
    private final float sizePriceFactor;
    Size(float sizePriceFactor)
    {
        this.sizePriceFactor=sizePriceFactor;
    }

    public float getSizePriceFactor() {
        return sizePriceFactor;
    }
    
}
