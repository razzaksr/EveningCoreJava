package org.corejava;

public class TypeParsing {
    public static void main(String[] args) {
        String para1="345";
        System.out.println(para1+200);
        int haiThere=0;

        haiThere=Integer.parseInt(para1);
        System.out.println(haiThere+200);

        String para2="5.6F";float heyThere=0F;
        heyThere=Float.parseFloat(para2);
        System.out.println(heyThere-2);
    }
}
