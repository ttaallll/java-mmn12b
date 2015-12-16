
public class BirthDate {
    public int day;
    public int month;
    public int year;

    public BirthDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s.%s.%s", day, month, year);
    }
}
