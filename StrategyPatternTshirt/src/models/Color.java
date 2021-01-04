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
public enum Color {
    RED(1.1f),ORANGE(1.2f),YELLOW(1.3f),GREEN(1.4f),BLUE(1.5f),INDIGO(1.6f),VIOLET(1.7f);
    
    private final float colorPriceFactor;
    Color(float colorPriceFactor)
    {
        this.colorPriceFactor=colorPriceFactor;
    }

    public float getColorPriceFactor() {
        return colorPriceFactor;
    }
    
}
