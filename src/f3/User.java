package f3;

public class User {

        private final String item;
        private final String sn;
        private final String conf;
        private final String dept;
        private final String sup;
        private final String purc;
        private final String war;
        private final String wars;
        private final String ware;

    public User(String SN,String Item,String Configuration,String Department,String Supplier,String Purchase,String Warrenty,String Warrentys,String Warrentye)
    {
        this.item = Item;
        this.sn = SN;
        this.conf = Configuration;
        this.dept = Department;
        this.sup = Supplier;
        this.purc = Purchase;
        this.war = Warrenty;
        this.wars = Warrentys;
        this.ware = Warrentye;
 
    }
    
    public String getItem()
    {
        return item;
    }
    
    public String getSN()
    {
        return sn;
    }
    
    public String getConfiguration()
    {
        return conf;
    }
    
    public String getDepartment()
    {
        return dept;
    }
    
    public String getSupplier()
    {
        return sup;
    }
    
    public String getPurchase()
    {
        return purc;
    }
        
    public String getWarrenty()
    {
        return war;
    }
            
    public String getWarrentys()
    {
        return wars;
    }
    
    public String getWarrentye()
    {
        return ware;
    }
    
}
    

