public class Loan{
    private Borrowable item;
    private Member member;
    private int borrowDay;
    private int dueDay;

    public Loan(Borrowable item, Member member, int borrowDay){
        this.item = item;
        this.member = member;
        this.borrowDay = borrowDay;
        this.dueDay = borrowDay + member.getLoanPeriod();
    }

    public Borrowable getItem(){return item;}

    public Member getMember(){return member;}

    public int getDueDay(){return dueDay;}

    public int daysLate(int today){
        if (today <= dueDay){return 0;}
        else {return today-dueDay;}
    }

    public int fine(int today){
        return item.getFinePerDay()*daysLate(today);
    }

    public boolean isOverdue(int today){
        return (today > dueDay);
    }
}