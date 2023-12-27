package academy.learnprogramming;

public class Main {
    public static void main(String[] args)
    {
        byte ByteValue = 10;
        short ShortValue = 20;
        int IntValue = 50;
        long LongTotal = 50000L + 10L * (ByteValue + ShortValue + IntValue);
        System.out.println(LongTotal);

        short ShortTotal = (short) (1000 + 10 * (ByteValue + ShortValue + IntValue));
        System.out.println(ShortTotal);
    }
}
