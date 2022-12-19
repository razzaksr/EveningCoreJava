package org.corejava.basic;

/*
4096 2048 1024 512 256 128 64 32 16 8 4 2 1
   0    0    0   0   0   0  0  0  1 0 1 0 0     >> 20>> wind
   0    0    0   1   0   1  0  0  0 0 0 0 0     >> 640
   0    0    0   0   0   0  1  1  1 1 0 1 0     >> 122 >> mark
   0    0    0   0   0   0  0  0  0 1 1 1 1     >>  15
 */

public class Shifting {
    public static void main(String[] args) {
        char mark='z';int wind=20;
        System.out.println(mark>>3);
        System.out.println(wind<<5);
    }
}
