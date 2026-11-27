public class Student extends Member{
    public Student(String id, String name){
        super(id, name);
    }
    public int getMaxItems(){return 3;}
    public int getLoanPeriod(){return 14;}
}