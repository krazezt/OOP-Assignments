package hust.soict.hedspi.test.Others;

public class GarbageCreator {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str);

        for (long i = 0; i < 10000000; i++) {
            str += "abcdefghijklmnopqrstuvwxyz";
        }
    }
}