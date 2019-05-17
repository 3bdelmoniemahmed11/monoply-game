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
public class Company extends Field
{
    private boolean isowned;
    public String company_name;
    public int company_price;
    private Player owner ;
    private int rent;
   
    
     public Company(int x , int y ,String company_name,int company_price)
    {
        super(x,y);
        this.company_name=company_name;
        this.company_price=company_price;
        
    }

    public int getRent() {
        return rent;
    }
    
    public boolean isIsowned() 
    {
        return isowned;
    }

    public void setIsowned(boolean isowned)
    {
        this.isowned = isowned;
    }
    
     public Player getOwner()
    {
        return owner;
    }
     public void setOwner(Player owner) 
    {
        this.owner = owner;
    }
    public void company_rent(int rent)
    {
        this.rent=rent;
        
    }
   
    @Override
    public int getmoney()
    {
      
   
     if(isIsowned())
     {
       return rent ;
     }
     else 
     {
         return company_price;
     }
    }
}
