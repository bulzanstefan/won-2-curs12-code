package ro.fasttrackit.curs12;

public class Schedule {
    private final int day;
    private final Month month;

    public Schedule(int day, Month month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return day + " of " + month;
    }
}
