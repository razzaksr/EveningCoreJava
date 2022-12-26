package org.corejava.oops;

public class DemoString {
    public static void main(String[] args) {
        String myField="Software Trainer";// literal object
        String mySeek=new String("    Unicorn Company   ");// non literal object
        System.out.println(mySeek.length()+" "+myField.length());

        // immutable
        System.out.println(mySeek+myField);
        System.out.println(mySeek.concat(myField));

        System.out.println(mySeek+"\n"+myField);

        //myField=myField.concat(" | Corporate Training");
        myField+=" | Corporate Training";

        System.out.println(myField);
        mySeek=mySeek.trim();
        System.out.println(mySeek.length());

        System.out.println(myField+" "+myField.getBytes());

        byte[] bb=myField.getBytes();

        for(byte each:bb){System.out.println((char)each);}

        String newOne=new String(bb);

        System.out.println(newOne);

        System.out.println(newOne.charAt(10));

        System.out.println(mySeek.substring(1,8));

        newOne.toLowerCase();

        System.out.println(newOne);

        mySeek=mySeek.toUpperCase();

        System.out.println(mySeek);
    }
}
