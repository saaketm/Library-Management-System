public class Staff extends Member{
    public Staff(String id, String name){
        super(id, name);
    }
    public int getMaxItems(){return 4;}
    public int getLoanPeriod(){return 21;}
}