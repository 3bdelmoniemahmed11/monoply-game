package test;
public abstract class Field
{
    private int xCoord , yCoord;
    public Field(int xCoord ,int yCoord  )
    {
     this.xCoord=xCoord;
     this.yCoord=yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }
    
   
    public abstract int getmoney();
    
}
