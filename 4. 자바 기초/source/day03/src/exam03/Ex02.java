package exam03;

public class Ex02 {
    public static void main(String[] args) {


            short value1 = 30000;
            int value2 = 2000000000;
            long value3 = 40000000000L;
            float value4 = 3.123123123F;
            double value5 = 3.123123123;


        short short1 = value1;
        int int1 = value2;
        long long1 = value3;
        float float1 = value4;
        double double1 = value5;



            System.out.println("byte <- short : " + value4);
            System.out.println();
            System.out.println("short <- int : " + value2);
            System.out.println();
            System.out.println("int <- long : " + value4);
            System.out.println();
            System.out.println("long <- float : " + value1);
            System.out.println();
            System.out.println("float <- double : " + value4);

    }
}
