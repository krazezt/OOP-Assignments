package hust.soict.hedspi.test.Others;

public class NoGarbage {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str);
        StringBuffer buffer = new StringBuffer();

        for (long i = 0; i < 10000000; i++) {
            buffer.append("abcdefghijklmnopqrstuvwxyz");
        }
        str = buffer.toString();
    }
}