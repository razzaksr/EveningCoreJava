package org.corejava.methods;

import java.util.Random;

public class UserDefined2 {

    public void actTwo(int dol){
        System.out.println("INR to the dollar "+dol+" is "+(dol*79.30));
    }

    /*
        floor : 6 * 2 = 12>> -1 >> 11 top most floor data count
        ###########
         #########
          #######
           #####
            ###
             #

     */

    public String lowerPyramid(short floor){
        String construct="";
        int quick=floor*2-1;
        for(int row=floor;row>0;row--){
            for(int space=floor;space>row;space--){
                construct+=" ";
            }
            for(int data=1;data<=quick;data++){
                construct+="#";
            }
            construct+="\n";
            quick-=2;
        }
        return construct;
    }

    public int getOTP(){
        Random ran=new Random();
        int num=ran.nextInt(10000);
        return num;
    }

    public static void main(String[] args) {
        UserDefined2 u2=new UserDefined2();

        int ot=u2.getOTP();
        System.out.println("OTP is "+ot);

        u2.actTwo(2430);
        String pat=u2.lowerPyramid((short)6);
        System.out.println(pat);
        pat=u2.lowerPyramid((short)10);
        System.out.println(pat);
    }
}