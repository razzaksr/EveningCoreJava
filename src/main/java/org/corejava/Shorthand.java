package org.corejava;

/*
Short-hand/ assignment: += -= *= /=

rule:
    left side of the var and storing var should be same
eg:
var1+=var2  >> var1=var1+var2
var2=var1*var2  >> not possible
 */

public class Shorthand {
    public static void main(String[] args) {
        char froyo='A', cupcake='a';
        System.out.println("Froyo is "+froyo+" cupcake "+cupcake);
//        froyo=(char)(froyo+cupcake);// 65+97    >> 162>> froyo
//        cupcake=(char)(froyo-cupcake);// 162-97 >> 65  > cupcake
//        froyo=(char)(froyo-cupcake);// 162-65   >> 97  > froyo
        froyo+=cupcake;// 65+97    >> 162>> froyo
        cupcake=(char)(froyo-cupcake);// 162-97 >> 65  > cupcake
        froyo-=cupcake;// 162-65   >> 97  > froyo
        System.out.println("Froyo is "+froyo+" cupcake "+cupcake);

        double self=5.6, base=9.3;
        System.out.println("Self value is "+self+" base value is "+base);
        self*=base;
        base=self/base;
        self/=base;
        System.out.println("Self value is "+self+" base value is "+base);
    }
}
