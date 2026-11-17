package basic;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        rules for implicit type casting
            destination data type must be larger then source data type eg-> byte -> int -> long1
         */
//        byte b =98;
//        int i =b;
//        System.out.println(b+" "+ i);
//
//        int n =300;
//        byte b1 = (byte) n;
//        System.out.println(b1);
//
//        /*
//        1. byte, short and char values are promoted to int.
//
//        2. If one operand is long, the whole expression will become long.
//
//        3. If one operand is float, the entire expression will become float.
//
//        4. If one operand is double, the entire expression will become double.
//         */
//
//        byte b2 = 50;
////        b= b *2; this will give error
//        b2 = (byte) (b2 * 2);
//        System.out.println(b2);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);

// f * b  --> float
// i / c  --> integer
// d * s  --> double

// float + integer --> float - double --> double

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
