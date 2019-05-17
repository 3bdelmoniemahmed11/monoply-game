/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author sara
 */
public class Tax extends Field
{
    
    int tax;
     public Tax(int xCoord ,int yCoord ,int tax)
    {
        super(xCoord,yCoord);
        this.tax=tax;
    }
      @Override
    public int getmoney() 
    {
           return tax;  
    }
   
}
