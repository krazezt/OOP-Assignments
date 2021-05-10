package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.DateUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestDateUtils {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");

    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2020, 12, 1, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2020, 11, 1, 0, 0, 0);
        LocalDateTime date3 = LocalDateTime.of(2021, 12, 1, 0, 0, 0);
        LocalDateTime date4 = LocalDateTime.of(2019, 12, 1, 0, 0, 0);

        LocalDateTime [] arrDates = {date1, date2, date3, date4};
        arrDates = DateUtils.sort(arrDates);
        for (int i = 0; i < arrDates.length; i++) {
            System.out.println(getDateTimeString(arrDates[i]));
        }
    }

    public static String getDateTimeString(LocalDateTime dateToConvert) {
        if (dateToConvert != null) return formatter.format(dateToConvert);
        else return null;
    }
}
