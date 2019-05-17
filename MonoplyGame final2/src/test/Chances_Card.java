package test;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Chances_Card extends Field
{  
    Random cards;
    int chances_card;
    private int money;
    private String message ;
    public Chances_Card(int x ,int y)
    {
        super(x,y);
        cards=new Random();
    }

    public String getMessage() {
        return message;
    }
    public int getmoney() {
        return money;
    }
    
    
    public void randomcard() 
    {
        chances_card=cards.nextInt(7)+1;
       
        if(chances_card==1)
       {
           message="u are talking too much pay 20";
          money=-20;
          
       }  
        
        else if(chances_card==2)
        {   
            message= "<html>Infrigement speed allowed <br>in leadership fine 50 $ </html>";
            money= -50;   
           
        }   
        
        else if(chances_card==3)
        {   
           message= "Pay 100 $ to hospital";
            money= -100;   
          
        }
        
        
       else  if(chances_card==4)
        {   
            message= "<html>Income tax were collected from <br>you by mistake you get 40 $</html>";
           
           money= 40;   
          
        }   
        
          
        
        else if(chances_card==5)
        {   
            message= "Go to prison";
           
            money= -1;
        }   
        
        else if(chances_card==6)
        {   
           message= "Bank pays you prize 50 $";
           
           money= -50;   
          
        }   
        
       else if (chances_card==7)
        {   
           message="Doctor payment pay 50$";
           
           money= -50;   
          
        } 
      
    }

    
    
}
