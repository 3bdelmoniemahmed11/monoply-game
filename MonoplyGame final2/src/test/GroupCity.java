package test;

import java.util.ArrayList;

public class GroupCity 
{
public ArrayList<City>list; 
private String ColorOfGroup;
private int GroupNumber;
boolean CompleteGroup;

    public GroupCity(String ColorOfGroup, int GroupNumber)
    {
        this.ColorOfGroup = ColorOfGroup;
        this.GroupNumber = GroupNumber; 
        list=new ArrayList<City>();
        CompleteGroup=false;
    }

public void AddCity(City city){
list.add(city);
AddTax();
}
private void AddTax(){
if(GroupNumber==list.size()){
    CompleteGroup=true;    

for(int i=0;i<list.size();i++){
    
list.get(i).setCity_rent(list.get(i).getmoney()*2);

}

}

}
public void ResetGroupToBank()
{

for(int i=0;i<list.size();i++){
list.get(i).setCity_rent(list.get(i).getmoney()/2);
list.get(i).setIsowned(false);

}
    
    
}




}
