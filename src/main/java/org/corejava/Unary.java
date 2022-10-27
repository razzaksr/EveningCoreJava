package org.corejava;

/*
Unary operator:
++  >> increment by + 1
--  >> decrement by - 1

placing:
varOPR      >> post     >> increment/decrement result will obtain next usage of the same variable
OPRvar      >> pre      >> increment/decrement result will obtain in same spot
 */

public class Unary {
    public static void main(String[] args) {
        char iliyas='D';int shiva=54;double vasan=9.2;
        System.out.println(iliyas+" "+shiva+" "+vasan);
        System.out.println(++iliyas+" "+shiva+" "+vasan);
        System.out.println(iliyas+" "+ shiva-- +" "+vasan);
        System.out.println(iliyas+" "+shiva+" "+vasan);

        System.out.println(iliyas+" "+shiva+" "+ --vasan);
    }
}
