package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class mainFunction {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String strM;
        int iYear, iChk[];

        System.out.print("Input the month : ");
        strM = a.nextLine();

        System.out.print("And the year : ");
        iYear = a.nextInt();

        strM = strM.toLowerCase();
        strM = strM.replace(".", "");
        strM = strM.replace(" ", "");

        mainFunction chk = new mainFunction();
        if (chk.check(strM, iYear)) {
            iChk = chk.fixStr(strM, iYear);
            numberOfDays nod = new numberOfDays();
            nod.setMonth(iChk[0]); //iChk[0] : month, iChk[1] : year.
            nod.setYear(iChk[1]);
            int days = nod.getDays();
            System.out.println("Number of days : " + days);
        } else {
            System.out.println("Invalid input !");
        }
        a.close();
    }

    private boolean check (String strMonth, int year) {
        String monthValues[] = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "sept", "oct", "nov", "dec", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        if (Arrays.asList(monthValues).contains(strMonth) && year > 0 && year < 10000) return true;
        else return false;
    }

    private int[] fixStr(String strMonth, int year) {
        int arrMY[] = {0, 0};
        if (strMonth.equals("january") || strMonth.equals("jan") || strMonth.equals("1")) arrMY[0] = 1;
        if (strMonth.equals("february") || strMonth.equals("feb") || strMonth.equals("2")) arrMY[0] = 2;
        if (strMonth.equals("march") || strMonth.equals("mar") || strMonth.equals("3")) arrMY[0] = 3;
        if (strMonth.equals("april") || strMonth.equals("apr") || strMonth.equals("4")) arrMY[0] = 4;
        if (strMonth.equals("may") || strMonth.equals("may") || strMonth.equals("5")) arrMY[0] = 5;
        if (strMonth.equals("june") || strMonth.equals("jun") || strMonth.equals("6")) arrMY[0] = 6;
        if (strMonth.equals("july") || strMonth.equals("jul") || strMonth.equals("7")) arrMY[0] = 7;
        if (strMonth.equals("august") || strMonth.equals("aug") || strMonth.equals("8")) arrMY[0] = 8;
        if (strMonth.equals("september") || strMonth.equals("sep") || strMonth.equals("sept") || strMonth.equals("9")) arrMY[0] = 9;
        if (strMonth.equals("october") || strMonth.equals("oct") || strMonth.equals("10")) arrMY[0] = 10;
        if (strMonth.equals("november") || strMonth.equals("nov") || strMonth.equals("11")) arrMY[0] = 11;
        if (strMonth.equals("december") || strMonth.equals("dec") || strMonth.equals("12")) arrMY[0] = 12;
        arrMY[1] = year;
        return arrMY;
    }
}
