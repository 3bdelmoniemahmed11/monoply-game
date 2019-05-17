package test;
public class Train_station extends Field
{
    private Player owner ;
    private boolean isowned;
    public String trainstation_name;
    private int trainstation_price;
    private int train_rent;
     
    public Train_station(int xCoord,int yCoord,String trainstation_name,int trainstation_price)
    {
       super(xCoord,yCoord);
       isowned=false;
       this.trainstation_name=trainstation_name;
       this.trainstation_price=trainstation_price;
    }

    public int getTrain_rent() {
        return train_rent;
    }

    public boolean isIsowned() 
    {
        return isowned;
    }

    public void setIsowned(boolean isowned) {
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
    public void trainstation_rent(int train_rent)
    {
        this.train_rent=train_rent;
    }
      
    @Override
    public int getmoney() 
    {
     if(isIsowned())
        {
           return train_rent ;
        }
     else 
       {
         return trainstation_price;
       }
        
    }
}
