package hust.soict.hedspi.aims.utils;
import java.util.Arrays;

public class NumberStandardization {
    private boolean checkDayMonthForm(String strMonth, String strDay) {
        String monthValues[] = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "sept", "oct", "nov", "dec", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String dayValues[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "nineth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twentyfirst", "twentysecond", "twentythird", "twentyfourth", "twentyfifth", "twentysixth", "twentyseventh", "twentyeighth", "twentynineth","thirtieth", "thirtyfirst", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
        if (Arrays.asList(monthValues).contains(strMonth) && Arrays.asList(dayValues).contains(strDay)) return true;
        else return false;
    }

    public int[] stringToInt(String strDay, String strMonth, String strYear) {
        int arrDMY[] = {0, 0, 0, 1};
        strDay = this.transToStandard(strDay);
        strMonth = this.transToStandard(strMonth);
        strYear = this.transToStandard(strYear);

        if (!checkDayMonthForm(strMonth, strDay) || (arrDMY[2] = convertYearToInt(strYear)) == -1) arrDMY[3] = 0;

        if(strDay.equals("first") || strDay.equals("1st")) arrDMY[0] = 1;
        if(strDay.equals("second") || strDay.equals("2nd")) arrDMY[0] = 2;
        if(strDay.equals("third") || strDay.equals("3rd")) arrDMY[0] = 3;
        if(strDay.equals("fourth") || strDay.equals("4th")) arrDMY[0] = 4;
        if(strDay.equals("fifth") || strDay.equals("5th")) arrDMY[0] = 5;
        if(strDay.equals("sixth") || strDay.equals("6th")) arrDMY[0] = 6;
        if(strDay.equals("seventh") || strDay.equals("7th")) arrDMY[0] = 7;
        if(strDay.equals("eight") || strDay.equals("8th")) arrDMY[0] = 8;
        if(strDay.equals("nineth") || strDay.equals("9th")) arrDMY[0] = 9;
        if(strDay.equals("tenth") || strDay.equals("10th")) arrDMY[0] = 10;
        if(strDay.equals("eleventh") || strDay.equals("11th")) arrDMY[0] = 11;
        if(strDay.equals("twelfth") || strDay.equals("12th")) arrDMY[0] = 12;
        if(strDay.equals("thirteenth") || strDay.equals("13th")) arrDMY[0] = 13;
        if(strDay.equals("fourteenth") || strDay.equals("14th")) arrDMY[0] = 14;
        if(strDay.equals("fifteenth") || strDay.equals("15th")) arrDMY[0] = 15;
        if(strDay.equals("sixteenth") || strDay.equals("16th")) arrDMY[0] = 16;
        if(strDay.equals("seventeenth") || strDay.equals("17th")) arrDMY[0] = 17;
        if(strDay.equals("eighteenth") || strDay.equals("18th")) arrDMY[0] = 18;
        if(strDay.equals("nineteenth") || strDay.equals("19th")) arrDMY[0] = 19;
        if(strDay.equals("twentieth") || strDay.equals("20th")) arrDMY[0] = 20;
        if(strDay.equals("twentyfirst") || strDay.equals("21st")) arrDMY[0] = 21;
        if(strDay.equals("twentysecond") || strDay.equals("22nd")) arrDMY[0] = 22;
        if(strDay.equals("twentythird") || strDay.equals("23rd")) arrDMY[0] = 23;
        if(strDay.equals("twentyfourth") || strDay.equals("24th")) arrDMY[0] = 24;
        if(strDay.equals("twentyfifth") || strDay.equals("25th")) arrDMY[0] = 25;
        if(strDay.equals("twentysixth") || strDay.equals("26th")) arrDMY[0] = 26;
        if(strDay.equals("twentyseventh") || strDay.equals("27th")) arrDMY[0] = 27;
        if(strDay.equals("twentyeighth") || strDay.equals("28th")) arrDMY[0] = 28;
        if(strDay.equals("twentynineth") || strDay.equals("29th")) arrDMY[0] = 29;
        if(strDay.equals("thirtieth") || strDay.equals("30th")) arrDMY[0] = 30;
        if(strDay.equals("thirtyfirst") || strDay.equals("31st")) arrDMY[0] = 31;

        if (strMonth.equals("january") || strMonth.equals("jan") || strMonth.equals("1")) arrDMY[1] = 1;
        if (strMonth.equals("february") || strMonth.equals("feb") || strMonth.equals("2")) arrDMY[1] = 2;
        if (strMonth.equals("march") || strMonth.equals("mar") || strMonth.equals("3")) arrDMY[1] = 3;
        if (strMonth.equals("april") || strMonth.equals("apr") || strMonth.equals("4")) arrDMY[1] = 4;
        if (strMonth.equals("may") || strMonth.equals("may") || strMonth.equals("5")) arrDMY[1] = 5;
        if (strMonth.equals("june") || strMonth.equals("jun") || strMonth.equals("6")) arrDMY[1] = 6;
        if (strMonth.equals("july") || strMonth.equals("jul") || strMonth.equals("7")) arrDMY[1] = 7;
        if (strMonth.equals("august") || strMonth.equals("aug") || strMonth.equals("8")) arrDMY[1] = 8;
        if (strMonth.equals("september") || strMonth.equals("sep") || strMonth.equals("sept") || strMonth.equals("9")) arrDMY[1] = 9;
        if (strMonth.equals("october") || strMonth.equals("oct") || strMonth.equals("10")) arrDMY[1] = 10;
        if (strMonth.equals("november") || strMonth.equals("nov") || strMonth.equals("11")) arrDMY[1] = 11;
        if (strMonth.equals("december") || strMonth.equals("dec") || strMonth.equals("12")) arrDMY[1] = 12;

        if (checkValidNumberOfDay(arrDMY)) return arrDMY;
        else return null;
    }

    private int convertYearToInt(String strYear) {
        String [] splittedString = strYear.split(" ");
        int form, tmp = 0, result = 0;
        if (Arrays.asList(splittedString).contains("hundred") || Arrays.asList(splittedString).contains("thousand") || Arrays.asList(splittedString).contains("million")) form = 1;
        else form = 2;

        if (form == 1) {
            for (int i = 0; i < splittedString.length; i++) {
                if (splittedString[i].equals("one")) {result += tmp; tmp = 1;} else
                if (splittedString[i].equals("two")) {result += tmp; tmp = 2;} else
                if (splittedString[i].equals("three")) {result += tmp; tmp = 3;} else
                if (splittedString[i].equals("four")) {result += tmp; tmp = 4;} else
                if (splittedString[i].equals("five")) {result += tmp; tmp = 5;} else
                if (splittedString[i].equals("six")) {result += tmp; tmp = 6;} else
                if (splittedString[i].equals("seven")) {result += tmp; tmp = 7;} else
                if (splittedString[i].equals("eight")) {result += tmp; tmp = 8;} else
                if (splittedString[i].equals("nine")) {result += tmp; tmp = 9;} else
                if (splittedString[i].equals("ten")) {result += tmp; tmp = 10;} else
                if (splittedString[i].equals("eleven")) {result += tmp; tmp = 11;} else
                if (splittedString[i].equals("twelve")) {result += tmp; tmp = 12;} else
                if (splittedString[i].equals("thirteen")) {result += tmp; tmp = 13;} else
                if (splittedString[i].equals("fourteen")) {result += tmp; tmp = 14;} else
                if (splittedString[i].equals("fifteen")) {result += tmp; tmp = 15;} else
                if (splittedString[i].equals("sixteen")) {result += tmp; tmp = 16;} else
                if (splittedString[i].equals("seventeen")) {result += tmp; tmp = 17;} else
                if (splittedString[i].equals("eighteen")) {result += tmp; tmp = 18;} else
                if (splittedString[i].equals("nineteen")) {result += tmp; tmp = 19;} else
                if (splittedString[i].equals("twenty")) {result += tmp; tmp = 20;} else
                if (splittedString[i].equals("thirty")) {result += tmp; tmp = 30;} else
                if (splittedString[i].equals("fourty")) {result += tmp; tmp = 40;} else
                if (splittedString[i].equals("fifty")) {result += tmp; tmp = 50;} else
                if (splittedString[i].equals("sixty")) {result += tmp; tmp = 60;} else
                if (splittedString[i].equals("seventy")) {result += tmp; tmp = 70;} else
                if (splittedString[i].equals("eighty")) {result += tmp; tmp = 80;} else
                if (splittedString[i].equals("ninety")) {result += tmp; tmp = 90;} else
                if (splittedString[i].equals("hundred")) {tmp = tmp*100;} else
                if (splittedString[i].equals("thousand")) {tmp = tmp*1000;} else
                if (splittedString[i].equals("million")) {tmp = tmp*1000000;} else
                        return -1;
            }
            result += tmp;
        } else {
            String [] firstPart = splittedString[0].split("-");
            for (int i = 0; i < firstPart.length; i++) {
                if (firstPart[i].equals("one")) {result += tmp; tmp = 1;} else
                if (firstPart[i].equals("two")) {result += tmp; tmp = 2;} else
                if (firstPart[i].equals("three")) {result += tmp; tmp = 3;} else
                if (firstPart[i].equals("four")) {result += tmp; tmp = 4;} else
                if (firstPart[i].equals("five")) {result += tmp; tmp = 5;} else
                if (firstPart[i].equals("six")) {result += tmp; tmp = 6;} else
                if (firstPart[i].equals("seven")) {result += tmp; tmp = 7;} else
                if (firstPart[i].equals("eight")) {result += tmp; tmp = 8;} else
                if (firstPart[i].equals("nine")) {result += tmp; tmp = 9;} else
                if (firstPart[i].equals("ten")) {result += tmp; tmp = 10;} else
                if (firstPart[i].equals("eleven")) {result += tmp; tmp = 11;} else
                if (firstPart[i].equals("twelve")) {result += tmp; tmp = 12;} else
                if (firstPart[i].equals("thirteen")) {result += tmp; tmp = 13;} else
                if (firstPart[i].equals("fourteen")) {result += tmp; tmp = 14;} else
                if (firstPart[i].equals("fifteen")) {result += tmp; tmp = 15;} else
                if (firstPart[i].equals("sixteen")) {result += tmp; tmp = 16;} else
                if (firstPart[i].equals("seventeen")) {result += tmp; tmp = 17;} else
                if (firstPart[i].equals("eighteen")) {result += tmp; tmp = 18;} else
                if (firstPart[i].equals("nineteen")) {result += tmp; tmp = 19;} else
                if (firstPart[i].equals("twenty")) {result += tmp; tmp = 20;} else
                if (firstPart[i].equals("thirty")) {result += tmp; tmp = 30;} else
                if (firstPart[i].equals("fourty")) {result += tmp; tmp = 40;} else
                if (firstPart[i].equals("fifty")) {result += tmp; tmp = 50;} else
                if (firstPart[i].equals("sixty")) {result += tmp; tmp = 60;} else
                if (firstPart[i].equals("seventy")) {result += tmp; tmp = 70;} else
                if (firstPart[i].equals("eighty")) {result += tmp; tmp = 80;} else
                if (firstPart[i].equals("ninety")) {result += tmp; tmp = 90;} else
                    {
                        return -1;
                    }
            }
            result += tmp;
            result *= 100;

            tmp = 0;
            String [] secondPart = splittedString[1].split("-");
            for (int i = 0; i < secondPart.length; i++) {
                if (secondPart[i].equals("one")) {result += tmp; tmp = 1;} else
                if (secondPart[i].equals("two")) {result += tmp; tmp = 2;} else
                if (secondPart[i].equals("three")) {result += tmp; tmp = 3;} else
                if (secondPart[i].equals("four")) {result += tmp; tmp = 4;} else
                if (secondPart[i].equals("five")) {result += tmp; tmp = 5;} else
                if (secondPart[i].equals("six")) {result += tmp; tmp = 6;} else
                if (secondPart[i].equals("seven")) {result += tmp; tmp = 7;} else
                if (secondPart[i].equals("eight")) {result += tmp; tmp = 8;} else
                if (secondPart[i].equals("nine")) {result += tmp; tmp = 9;} else
                if (secondPart[i].equals("ten")) {result += tmp; tmp = 10;} else
                if (secondPart[i].equals("eleven")) {result += tmp; tmp = 11;} else
                if (secondPart[i].equals("twelve")) {result += tmp; tmp = 12;} else
                if (secondPart[i].equals("thirteen")) {result += tmp; tmp = 13;} else
                if (secondPart[i].equals("fourteen")) {result += tmp; tmp = 14;} else
                if (secondPart[i].equals("fifteen")) {result += tmp; tmp = 15;} else
                if (secondPart[i].equals("sixteen")) {result += tmp; tmp = 16;} else
                if (secondPart[i].equals("seventeen")) {result += tmp; tmp = 17;} else
                if (secondPart[i].equals("eighteen")) {result += tmp; tmp = 18;} else
                if (secondPart[i].equals("nineteen")) {result += tmp; tmp = 19;} else
                if (secondPart[i].equals("twenty")) {result += tmp; tmp = 20;} else
                if (secondPart[i].equals("thirty")) {result += tmp; tmp = 30;} else
                if (secondPart[i].equals("fourty")) {result += tmp; tmp = 40;} else
                if (secondPart[i].equals("fifty")) {result += tmp; tmp = 50;} else
                if (secondPart[i].equals("sixty")) {result += tmp; tmp = 60;} else
                if (secondPart[i].equals("seventy")) {result += tmp; tmp = 70;} else
                if (secondPart[i].equals("eighty")) {result += tmp; tmp = 80;} else
                if (secondPart[i].equals("ninety")) {result += tmp; tmp = 90;} else
                    {
                        return -1;
                    }
            }
            result += tmp;
        }
        return result;
    }

    private String transToStandard(String strToTrans) {
        strToTrans = strToTrans.toLowerCase();
        strToTrans = strToTrans.replace(".", "");
        strToTrans = strToTrans.replace("  ", " ");
        return strToTrans;
    }

    private static boolean checkValidNumberOfDay(int [] intDMY) {
        if (intDMY[0] > getMaxDaysOfMonth(intDMY[1], intDMY[2])) return false;
        else return true;
    }

    private static int getMaxDaysOfMonth(int month, int year) {
        switch (month) {
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                return 31;
            case 4 : case 6 : case 9 : case 11 :
                return 30;
            case 2 :
                if (year%4==0 && year%100!=0 || year%400==0)
                    return 29;
                else
                    return 28;
        }
        return 0;
    }
}
