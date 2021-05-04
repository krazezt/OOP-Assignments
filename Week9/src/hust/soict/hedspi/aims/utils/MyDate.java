package hust.soict.hedspi.aims.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyDate {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");        //String formatter.format(dateOrdered)
    private LocalDateTime dateOrdered = null;
    private int [] intDMY = {0, 0, 0};

    public MyDate() {
        this.dateOrdered = LocalDateTime.now();
    }

    public MyDate(String day, String month, String year) {
        DMYStandardization convert = new DMYStandardization();
        if ((intDMY = convert.stringToInt(day, month, year)) != null) this.dateOrdered = LocalDateTime.of(intDMY[2], intDMY[1], intDMY[0], 0, 0, 0);
        else System.out.println("Invalid input, check them then try again !");
    }

    public String getDateTimeString() {
        if (this.dateOrdered != null) return formatter.format(this.dateOrdered);
        else return null;
    }
}
