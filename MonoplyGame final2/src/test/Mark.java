package test;
import java.awt.Dimension;
import javax.swing.JLabel;

public class Mark 
{
    private int x =1227,y=750;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
  
            
    void move(JLabel label,int resultNrd,int player) {
        
       for(int i=0;i<resultNrd;i++){
        CalculatePosition();   
       }
         Dimension size = label.getPreferredSize();
    if(player==1){label.setBounds(x, y, size.width, size.height);}     
    if(player==2){label.setBounds(x-15, y, size.width, size.height);}
    if(player==3){label.setBounds(x+15, y, size.width, size.height);}
    if(player==4){label.setBounds(x, y-15, size.width, size.height);}
    
      
        
}
void CalculatePosition(){
    if(x==177&&y==750){
    y-=73;
    }
    else if(x==177&&y==92){
    x+=48;
    }
    else if(x==1170&&y==92){
    
    y+=47;
    }
    else if(x==1170&&y==659){
    x=1227;
    y=750;
    
    }
    
    
    else if(y==750&&x>177&&x<=1227){
        x-=105;

    }
    else if(x==177&&y<750&&y>92) {
    y-=65;
    
    } else if(y==92&&x>177&&x<1170) {
    x+=105;
    
    }
    
     else if(x==1170&&y>92&&y<659) {
    y+=65;
    
    }

}
void go_prison(JLabel label,int player){

     Dimension size = label.getPreferredSize();
    if(player==1){label.setBounds(177, 750, size.width, size.height);}     
    if(player==2){label.setBounds(177-15, 750, size.width, size.height);}
    if(player==3){label.setBounds(177+15, 750, size.width, size.height);}
    if(player==4){label.setBounds(177, 750-15, size.width, size.height);}
    
       
}
    
    
}
