package ru.geekbrains.lesson1home;

public class JavaApp {
    static float a, b, c, d;
    static int a1, b1, d1,x;
    static boolean boo;
    public static void main(String arg[]) {
        byte byteVal = -111;
        short shortVal = -25000;
        int intVal = 28;
        long longVal = 128000L;
        float floatVal = 0.123f;
        double doubleVal = 0.111;
        char charVal = '\u2242';
        boolean booleanVal = true;
        char[] chars = {'H', 'E', 'L', 'L', 'O'};
        System.out.println(chars);
        System.out.println(floatRes(0.5f, 1f, 20.5f, 4f));
        System.out.println(sum10and20(18, 5)+" "+"(true, если сумма в диапазоне [10;20])");
        isPositiveOrNegative(-6);
        System.out.println(isNegative(-9)+" "+"(true-введенное число отрицательное, false-положительное)");
        greetings("Ирина");
        leapYear(2400);
    }
    public static float floatRes(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    public static boolean sum10and20(int a1, int b1) {
        if ((a1 + b1) >= 10 & (a1 + b1) <= 20) {
            return boo = true;
        } else {
            return boo = false;
        }
    }
    public static void isPositiveOrNegative(int x) {
        if (x < 0) {
            System.out.println(x+" "+"(это число отрицательное)");
        } else {
            System.out.println(x+" "+"(это число положительное)");
        }
    }
    public static boolean isNegative(int x) {
        if (x<0) {
            return boo=true;
        } else {
            return  boo=false;
        }
    }
    public static void greetings(String name){
        System.out.println("Привет,"+" "+name+"!");
    }
    public static void leapYear(int x){
        int a1=x%4;
        int b1=x%100;
        int d1=x%400;
        if (a1!=0 || (b1==0 && d1!=0)) {
            System.out.println(x+" "+"- невисокосный год");
        } else {
            System.out.println(x+" "+"- високосный год");
        }
    }
}


