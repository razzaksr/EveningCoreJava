package org.corejava.grouping;

/*
Array:
    grouping same type of values in the single var/object
    each values in the array has positions
        usually positions of array starts from 0
    array has property LENGTH which used to get the count of values in array

    syntax:
        initializing array with values and size will be defined automatically
            type[] var/obj={v1,v2,v3,v4,............};
        just mention the size not values
            type[] var/obj=new type[size];
    Operations:
        Create
        Insert              >> loop
        Update
        Read
        List/ Traverse      >> visiting each index/position of array
        Search
        Sort
 */

public class Creation {
    public static void main(String[] args) {
        String[] endgame={"Robert Downey","Johanson","Pratt","Evans","Jeremy","Hemsworth"};
        System.out.println(endgame.length);

//        int index=2;// start
//        while(index<endgame.length-1)// end
//        {
//            System.out.println(endgame[index]);
//            index++;// iter
//        }

        // for each loop
        for(String agilan:endgame){
            System.out.println(agilan);
        }

//        System.out.println(endgame[0]);
//        System.out.println(endgame[1]);
//        System.out.println(endgame[2]);
//        System.out.println(endgame[3]);
//        System.out.println(endgame[4]);
//        System.out.println(endgame[5]);
    }
}
