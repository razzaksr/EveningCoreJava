package org.corejava.basic;

/*
Bitwise : &(and) |(or) ^(xor) >>(right shift) <<(left shift)
    float,double are not supported in this operator
    all values has to be converted to binary(0's 1's)

    4096 2048 1024 512 256 128 64 32 16 8 4 2 1
       0    0    0   0   1   0  1  0  1 1 0 0 1     >> 345  >> queen

       0    0    0   0   0   0  1  1  0 0 0 1 0     >>  98  >> picso

       0    0    0   0   1   0  0  1  1 1 0 1 1     >> 315  >> queen
       0    0    0   0   1   0  1  0  1 1 0 0 1     >> 345  >> picso
       0    0    0   0   0   0  1  1  0 0 0 1 0     >>  98  >> queen

       0    0    0   0   1   1  1  1  1 0 1 0 0     >> 500      (^)
       0    0    0   0   0   0  1  1  1 1 0 0 0     >> 120
       0    0    0   0   1   1  0  0  0 1 1 0 0     >> 396

       0    0    0   0   0   0  1  1  0 0 0 1 0     >>  98      (|)
       0    0    0   0   1   1  1  0  0 0 1 1 1     >> 455
       0    0    0   0   1   1  1  1  0 0 1 1 1     >> 487

       0    0    0   0   1   0  1  0  1 1 0 0 1     >> 345      (&)
       0    0    0   0   0   0  0  0  1 0 1 1 0     >>  22
       0    0    0   0   0   0  0  0  1 0 0 0 0     >>  16

    eg: 55
       0    0    0   0   0   0  0  1  1 0 1 1 1     >> 55
 */

public class BitWise {
    public static void main(String[] args) {
        int queen=345;char picso='b';// 98
        System.out.println(queen&22);
        System.out.println(picso|455);
        System.out.println(500^120);

        System.out.println(queen+" "+picso);
        queen^=picso;// queen = queen ^ picso
        picso^=queen;
        queen^=picso;// queen = queen ^ picso
        System.out.println(queen+" "+(int)picso);
    }
}
