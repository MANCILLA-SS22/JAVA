package academy.learnprogramming;

public class Main {
    public static void main(String[] args)
    {
        int MyValue = 1000;
        int MyMinValue = Integer.MIN_VALUE;
        int MyMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + MyMinValue);
        System.out.println("Integer minimum value = " + MyMaxValue);
        System.out.println("Busted MAX value = "+ (MyMaxValue + 1));
        System.out.println("Busted MIN value = "+ (MyMinValue - 1));

        int MyMaxIntTest = 2_147_483_647;

        byte MyMinByteValue = Byte.MIN_VALUE;
        byte MyMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+ MyMinByteValue);
        System.out.println("Byte Minimum Value = "+ MyMaxByteValue);

        short MyMinShortValue = Short.MIN_VALUE;
        short MyMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value = "+ MyMinShortValue);
        System.out.println("short Minimum Value = "+ MyMaxShortValue);

        long MyLongValue = 100;
        long MyMinLongValue = Long.MIN_VALUE;
        long MyMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = "+ MyMinLongValue);
        System.out.println("long Minimum Value = "+ MyMaxLongValue);
        long BigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(BigLongLiteralValue);

        short BigShortLiteralValue = 32767;

        int MyTotal = (MyMinValue / 2);

        byte MyNewByteValue = (byte)(MyMinByteValue / 2);

        short MyNewShortValue = (short)(MyMinShortValue / 2);
    }
}