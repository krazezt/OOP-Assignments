package hust.soict.hedspi.lab02.Bai3;
public class numberOfDays {
    private int month;
    private int year;

    public void setMonth(int iMonth) {
        this.month = iMonth;
    }

    public void setYear(int iYear) {
        this.year = iYear;
    }

    public int getDays() {
        switch (this.month) {
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                return 31;
            case 4 : case 6 : case 9 : case 11 :
                return 30;
            case 2 :
                if (this.year%4==0 && this.year%100!=0 || this.year%400==0)
                    return 29;
                else
                    return 28;
        }
        return 0;
    }
}
