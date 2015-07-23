package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("QA Factory");
        int x = 10;
        int a;
        a = 15;
        System.out.println(a);
        a = a + 1; // -> a = 15 + 1 -> a = 16
        System.out.println(a);
        a = x + a + (15 + x)*2; // 10 + 16 + 15 + 10*2 -> a = 61
        System.out.println(a);
        String s = "hello class";
        System.out.println(s);
        int g = 288;
        System.out.println(s + g);
        System.out.println(s + " " + g);
        System.out.println("g=" + g);

        double h = 10.5;
        System.out.println(h / 3);
        System.out.println(h / 8);
        System.out.println(10 / 3);

        boolean o;
        o = true;
        o = false;
        o = true && false;
        System.out.println(o);
        o = true && true;
        System.out.println(o);
        o = true || false;
        System.out.println(o);

        System.out.println(h == 10.5);
        System.out.println(h == 3);

        System.out.println(10 > 5);
        System.out.println(10 != 5); // ?? ?????
        System.out.println(10 < 5); // System.out.println(10);

        int[] m = {1,10,20};

        System.out.println(m[0] + " " + m[1] + " " + m[2]);
        int p;
        p = m[0];
        System.out.println(p);

        String[] m1 = {"hello", "class"};
        System.out.println(m1[0] + " " + m1[1]);

        m[1] = 30;
        System.out.println(m[1]);
        boolean[] b1 = {true, false, false, false, true};

        String jj = "hello" + "asdasd" + "sadasas";

        System.out.println("" + true + false);

        int y = 10;
        if (y < 10) {
            System.out.println("a < 10");
        } else {
            System.out.println("a >= 10");
        }

        int xy = 0;
        while (xy < 10) {
            xy = xy + 5;
            xy = xy - 4;
            System.out.println("xy = " + xy);
        }

        System.out.println("finish");

        int j = 0;
        while (j <= 1000) {
            System.out.println(j);
            j += 2;
        }







        int a1 = 0, a2 = 1, a3, a4 = 0;
        while (a4 < 20) {
            System.out.print(a1 + " ");
            a3 = a1;
            a1 = a2;
            a2 = a1 + a3;
            a4 = a4 + 1;
        }
        System.out.println();
        int[] m2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i=0; i<12; i++) {
            if (m2[i] == 8) {
                break;
            }

            System.out.print(m2[i] + " ");
        }
        System.out.println();
        for (int i=0; i<12; i++) {
            if (m2[i] == 6) {
                continue;
            }

            System.out.print(m2[i] + " ");
        }

        System.out.println();
        System.out.println(8 % 2);

        // 1 2 3    5 6 7    9 10 11    13 14 15
    }
}










