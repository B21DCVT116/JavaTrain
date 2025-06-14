class SimpleDate{
  private int day;
  private int month;
  private int year;
  public SimpleDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public int getDay() {
    return day;
  }
  public void setDay(int day) {
    this.day = day;
  }
  public int getMonth() {
    return month;
  }
  public void setMonth(int month) {
    this.month = month;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public boolean equals(Object other){
    if (other instanceof SimpleDate) {
      SimpleDate otherDate = (SimpleDate) other;
      return this.day == otherDate.day && this.month == otherDate.month && this.year == otherDate.year;
    }
    return false;
  }
}

public class OBJECT_REFERENCES001 {
  public static void main(String[] args) {
      SimpleDate date1 = new SimpleDate(1,2,2000);

      System.out.println(date1.equals("heh"));
      System.out.println(date1.equals(new SimpleDate(5,2,2012)));
      System.out.println(date1.equals(new SimpleDate(1,2,2001)));
  }
}
