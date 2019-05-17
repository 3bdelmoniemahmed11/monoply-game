
package test;
import java.util.ArrayList;
public class Group_company
{
ArrayList<Company>list; 
int GroupNumber;
int dice_retrn;

 public Group_company(int GroupNumber)
    { 
         list=new ArrayList<Company>();
        this.GroupNumber = GroupNumber;  
    }

public void AddCompany(Company company)
   {
      list.add(company);
      AddTax();
   }


private void AddTax() 
   {
       if(GroupNumber==list.size()){
for(int i=0;i<list.size();i++){
    
list.get(i).company_rent(100);

}

}
       
       
       

   }
public void GetOut(){

for(int i=0;i<list.size();i++){
list.get(i).company_rent(20);
list.get(i).setIsowned(false);

}
    
    
}

    
}
