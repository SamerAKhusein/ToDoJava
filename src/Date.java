public class Date {
    private int day;
    private int month;
    private int year;
   // public Date(int day,int month,int year){
      //  this.year=year;
      //  this.day=day;
      //  this.month=month;



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
    public String toString(){
        return month + "/" + day + "/" + year;
    }
}
