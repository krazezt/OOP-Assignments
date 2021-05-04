package hust.soict.hedspi.aims.utils;
import java.time.*;

public class DateUtils {
    private static LocalDateTime [] arrayOfDates;

    public int compareTwoDate(LocalDateTime dateToCompare1, LocalDateTime dateToConpare2) {     //return : > 0 : date1 after date2 || == 0 : date1 = date2 || < 0 : date1 before date2
        return dateToCompare1.compareTo(dateToConpare2);
    }

    public static LocalDateTime [] sort(LocalDateTime [] arrayOfDatesToSort) {
        arrayOfDates = arrayOfDatesToSort;
        quickSort(0, arrayOfDatesToSort.length-1);
        return arrayOfDates;
    }

    private static int partition(int low, int high) {
        LocalDateTime pivot = arrayOfDates[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arrayOfDates[j].compareTo(pivot) > 0) {
                i++;
                LocalDateTime temp = arrayOfDates[i];
                arrayOfDates[i] = arrayOfDates[j];
                arrayOfDates[j] = temp;
            }
        }

        LocalDateTime temp = arrayOfDates[i + 1];
        arrayOfDates[i + 1] = arrayOfDates[high];
        arrayOfDates[high] = temp;

        return i + 1;
    }

    private static void quickSort(int l, int r) {
        if (l < r) {
            int pi = partition(l, r);

            quickSort(l, pi - 1);
            quickSort(pi + 1, r);
        }
    }
}
