package test;
public class City extends Field
{
    private boolean isowned;
    public String city_name;
    public String city_color ;
    public int city_price;
    private int city_rent;
    public int No_houses;
    public int No_hotels;
    private Player owner ;
  
    public City(int x , int y ,String city_name,String city_color,int city_price)
    {
        super(x,y);
        isowned=false;
        this.city_name=city_name;
        this.city_color=city_color;
        this.city_price=city_price;
        //this.No_houses=No_houses;
        //this.No_hotels=No_hotels;
    }

    public int getCity_rent() {
        return city_rent;
    }
    
    public boolean isIsowned() 
    {
        return isowned;
    }

    public void setIsowned(boolean isowned)
    {
        this.isowned = isowned;
    }

    public void setCity_rent(int city_rent)
    {
        this.city_rent = city_rent;
    }
    public Player getOwner()
    {
        return owner;
    }

    public void setOwner(Player owner) 
    {
        this.owner = owner;
    }
    

    @Override
    public int getmoney()
    {
     if(isIsowned())
     {
       return city_rent;
     }
     else 
     {
        return city_price;
     }
    }
      
}
