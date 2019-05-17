package test;
import java.util.ArrayList;
import javax.swing.JLabel;
public class Player {
    //attributies
    private String playerName;
    private int playerMoney;
    private int locationX;//has it's intial value
    private int locationY;
    private boolean getout;
    Mark mark ;
    private boolean injail;//maybe i need it for check to call the class in jail
    public GroupCity purple;
    public GroupCity grey;
    public GroupCity pink;
    public GroupCity orange  ;
    public GroupCity red;
    public GroupCity yellow;
    public GroupCity green;
    public GroupCity blue;
    
    boolean CompleteGrouppurple;
    boolean CompleteGroupgrey;
    boolean CompleteGrouppink;
    boolean CompleteGrouporange;
    boolean CompleteGroupred;
    boolean CompleteGroupyellow;
    boolean CompleteGroupgreen;
    boolean CompleteGroupblue;
    
    
    private Group_company group_company;
    private Group_trainstation group_trainstation;
    private ArrayList<String> property;
    
    public Player(String playerName)
    {
        playerMoney=1500;
         getout=false;
         mark =new Mark();
         CompleteGrouppurple=false;
         CompleteGroupgrey=false;
         CompleteGrouppink=false;
         CompleteGrouporange=false;
         CompleteGroupred=false;
         CompleteGroupyellow=false;
         CompleteGroupgreen=false;
         CompleteGroupblue=false;
         
         group_company =new Group_company(2);
         group_trainstation=new Group_trainstation(4);
         property = new ArrayList<String>();
         
        purple=new GroupCity("purble", 2);
        grey=new GroupCity("grey", 3);
        pink=new GroupCity("pink", 3);
        orange=new GroupCity("orange", 3);
        red=new GroupCity("red", 3);
        yellow=new GroupCity("yellow", 3);
        green=new GroupCity("green", 3);
        blue=new GroupCity("blue", 3);
      
        this.playerName=playerName;
        this.locationX=1227;
        this.locationY=750;
        this.injail=false; 
    }

    public void setGetout(boolean getout) {
        this.getout = getout;
    }

    public boolean isGetout() {
        return getout;
    }
    
      public void add_company(Company company)
    {
       group_company.AddCompany(company);
       property.add(company.company_name);
    }
    public void add_trainstation(Train_station train_station)
    {
        group_trainstation.Add_trainstation(train_station);
        property.add(train_station.trainstation_name);
    }
    
    public void addcity(City city){
     property.add(city.city_name);   
     if(city.city_color=="purble"){
     purple.AddCity(city);
     
     if(purple.CompleteGroup){
     CompleteGrouppurple=true;
     
     }
     
     }
     if(city.city_color=="grey"){
     grey.AddCity(city);
     if(grey.CompleteGroup){
     CompleteGroupgrey=true;
     
     }
     
     }
      if(city.city_color=="pink"){
     pink.AddCity(city);
     if(pink.CompleteGroup){
     CompleteGrouppink=true;
     
     }
     
     }
        if(city.city_color=="orange"){
     orange.AddCity(city);
     if(orange.CompleteGroup){
     CompleteGrouporange=true;
     
     }
     
     }
         if(city.city_color=="red"){
     red.AddCity(city);
     if(red.CompleteGroup){
     CompleteGroupred=true;
     
     }
     
     
     }
      if(city.city_color=="yellow"){
     yellow.AddCity(city);
     if(yellow.CompleteGroup){
     CompleteGroupyellow=true;
     
     }
     
     
     }
       if(city.city_color=="green"){
     green.AddCity(city);
     if(green.CompleteGroup){
     CompleteGroupgreen=true;
     
     }
     
     
     }
        if(city.city_color=="blue"){
     blue.AddCity(city);
     if(blue.CompleteGroup){
     CompleteGroupblue=true;
     
     }
     
     }
  }
       public void getout()
    {
     purple.ResetGroupToBank();
    grey.ResetGroupToBank();
     pink.ResetGroupToBank();
    orange.ResetGroupToBank();  ;
     red.ResetGroupToBank();
     yellow.ResetGroupToBank();
     green.ResetGroupToBank();
     blue.ResetGroupToBank();
     group_trainstation.GetOut();
     group_company.GetOut(); 
     getout=true;
     
     
    }
    public void setInjail(boolean injail) {
        this.injail = injail;
    }

    public boolean isInjail() {
        return injail;
    }
 
     public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
     public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }
    
    public int getPlayerMoney() {
        return playerMoney;
    }

    public void earnMoney(int Amount)
    {
        playerMoney+=Amount;
    }
    
    public void payMoney(int Tax)
    {
        if(this.playerMoney>=Tax)
        {
         playerMoney-=Tax;   
        }
        else 
        {
            getout();
    
        }
    }
   
    public void pay(Player p,int Tax)
    {
        if(this.playerMoney>=Tax)
        {
             payMoney(Tax);
             p.earnMoney(Tax);
        }
        else 
        {
         getout();        
        }
       
    }

    public ArrayList<String> getProperty() {
        return property;
    }
  

public void go_prison(JLabel label,int player){
    mark.go_prison(label,player+1);
    injail=true;
    locationX= 177;
    locationY=750;
}    
public void move(JLabel label,int resultNrd,int player){
 
  mark.move(label,resultNrd,player+1);
  
 if(mark.getX()==1170&&mark.getY()==92){
     
     go_prison(label,player+1);
     
 }   

 locationX= mark.getX();
  locationY=mark.getY();

}    
    
}
