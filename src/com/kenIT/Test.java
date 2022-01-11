package com.kenIT;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.p(10);
        b.p(10);



        int a;
        int b1;
        int c;
        a = p(1, 2);
        b1 = p(1, 2, 22);


        System.out.println(a);
        System.out.println(b1);
    }

    public static int p(int a, int b) {
        return a + b;
    }

    public static int p(int a, int b, int c) {
        return (a + b + c);
    }


}
