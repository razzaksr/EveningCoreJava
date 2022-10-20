package org.corejava;

public class TypeCasting {
    public static void main(String[] args) {
        // implicit
        char alpha1='D';int cosmo=0;

        cosmo=alpha1;

        System.out.println(cosmo);

        short wik=3415; float check=0;

        check=wik;

        System.out.println(check);

        // explicit casting
        int numberA=12;double numberB=4.1;

        System.out.println(numberA+" "+numberB);

        numberA=(int)(numberB+numberA);

        System.out.println(numberA);

        short value1=97; char value2='\0';// null char  -127 to +128

        value2=(char)value1;

        System.out.println(value2);
    }
}
