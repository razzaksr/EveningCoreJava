package org.corejava.processing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class EncodedWriting {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Course backups\\Java\\EveningJava\\myEncode.doc");
        FileOutputStream fos=new FileOutputStream(file);
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the content to be encoded in "+file.getName());
        String data=scanner.nextLine();

        dos.write(data.getBytes());
        scanner.close();

//        Kettle ket1=new Kettle("Preethi",2,1200);
//
//        //dos.write(ket1.toString().getBytes());
//        dos.write(ket1.getBrand().getBytes());
//        dos.write((ket1.getCapacity()+"").getBytes());
//        dos.write((ket1.getPrice()+"").getBytes());

        dos.close();
        fos.close();

        System.out.println("Encoded content saved in "+file.getAbsoluteFile());
    }
}
