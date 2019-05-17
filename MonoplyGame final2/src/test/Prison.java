package test;
import java.awt.Dimension;
import javax.swing.JLabel;

public class Prison extends Field
{

    public Prison() {
        super(177, 750);
    }
public void Move(JLabel label,int player,Mark m,Player p)
{
    Dimension size = label.getPreferredSize();
    if(player==1){label.setBounds(1170, 92, size.width, size.height);}     
    if(player==2){label.setBounds(1170-15, 92, size.width, size.height);}
    if(player==3){label.setBounds(1170+15, 92, size.width, size.height);}
    if(player==4){label.setBounds(1170, 92-15, size.width, size.height);}
    
    m.setX(1170);
    m.setY(92);
    p.setLocationX(1170);
    p.setLocationY(92);
    p.setInjail(true);
}   

    public int getmoney() { 
        return 0;
    }
}
