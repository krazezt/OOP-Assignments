package hust.soict.hedspi.test.Others;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random rd = new Random(123);
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 65536; i++) {
            str += rd.nextInt(2);
        }
        System.out.println(System.currentTimeMillis() - startTime);

        str = "";
        System.out.println(str);

        rd = new Random(123);
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) sb.append(rd.nextInt(2));
        str = sb.toString();
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
