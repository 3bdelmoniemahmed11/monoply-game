package test;
public class Hotel
{
    private int price;
    public Hotel(String group_color)
    {
        if((group_color.equals("green"))||group_color.equals("blue"))
        {
            price=400;
        }
        else if((group_color.equals("pink"))||group_color.equals("orange"))
        {
            price=200;
        }
        else if((group_color.equals("red"))||group_color.equals("yellow"))
        {
            price=300;
        }
        else if((group_color.equals("purple"))||group_color.equals("grey"))
        {
            price=100;
        } 
    }

    public int getPrice() {
        return price;
    }
    
    
}
