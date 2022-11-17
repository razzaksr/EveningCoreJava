package org.corejava;

/*

perfect square
#####
#####
#####
#####
#####

1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

floyd's: left upper, left lower, right upper, right lower
#
##
###
####
#####

2
4 6
8 10 12
14 16 18 20
22 24 26 28 30

left lower
#####
####
###
##
#

right upper
    #
   ##
  ###
 ####
#####

right lower
#####
 ####
  ###
   ##
    #

pascal triangle upper
    #
   # #
  # # #
 # # # #
# # # # #

pascal triangle lower
# # # # #
 # # # #
  # # #
   # #
    #

pyramid upper
    #
   ###
  #####
 #######
#########

#########
 #######
  #####
   ###
    #

 */

public class Patterns {
    public static void main(String[] args) {
        // perfect square
//        int digit=1;
//        for(int row=1;row<=5;row++){
//            for(int data=1;data<=5;data++,digit++){
//                System.out.print(digit+" ");
//            }
//            System.out.println();
//        }

        // left upper floyd
//        int digit=2;
//        for(int row=1;row<=5;row++){
//            for(int data=1;data<=row;data++,digit+=2){
//                System.out.print(digit);
//            }
//            System.out.println();
//        }

        // right upper
//        char let='A';
//        for(int row=1;row<=5;row++){
//            for(int space=5;space>row;space--){
//                System.out.print(" ");
//            }
//            for(int data=1;data<=row;data++,let++){
//                System.out.print(let);
//            }
//            System.out.println();
//        }

        // pascal upper
        //char let='A';
//        for(int row=1;row<=5;row++){
//            for(int space=5;space>row;space--){
//                System.out.print(" ");
//            }
//            for(int data=1;data<=row;data++){
//                System.out.print("# ");
//            }
//            System.out.println();
//        }

        int quick=1;
        for(int row=1;row<=5;row++){
            for(int space=5;space>row;space--){
                System.out.print(" ");
            }
            for(int data=1;data<=quick;data++){
                System.out.print("#");
            }
            System.out.println();
            quick+=2;
        }
    }
}
