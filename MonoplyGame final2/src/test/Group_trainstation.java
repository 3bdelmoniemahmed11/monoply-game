package test;

import java.util.ArrayList;

public class Group_trainstation 
{
 ArrayList<Train_station>list; 
int GroupNumber;
 public Group_trainstation (int GroupNumber)
    {
        list=new ArrayList<Train_station>();
        this.GroupNumber = GroupNumber;  
    }

public void Add_trainstation (Train_station train_station)
{
  list.add(train_station);
   AddTax();
}
private void AddTax()
{
    if(GroupNumber==list.size()){
for(int i=0;i<list.size();i++){
    
list.get(i).trainstation_rent(list.get(i).getmoney()*2);

}

}

    
}

public void GetOut(){

for(int i=0;i<list.size();i++){
list.get(i).trainstation_rent(list.get(i).getmoney()/2);    
list.get(i).setIsowned(false);
}
    
    
}
    
}
