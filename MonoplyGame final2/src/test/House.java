package test;
public class House
{
    private int price ;
   
    public House(String group_color)
    {
        if((group_color.equals("green"))||group_color.equals("blue"))
        {
            price=200;
        }
        else if((group_color.equals("pink"))||group_color.equals("orange"))
        {
            price=100;
        }
        else if((group_color.equals("red"))||group_color.equals("yellow"))
        {
            price=150;
        }
        else if((group_color.equals("purple"))||group_color.equals("grey"))
        {
            price=50;
        }  
      
    }
        public int getPrice() {
        return price;
    }    
    
}
