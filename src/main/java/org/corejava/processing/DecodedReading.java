package org.corejava.processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DecodedReading {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Course backups\\Java\\EveningJava\\myEncode.doc");
        FileInputStream fis=new FileInputStream(file);
        InflaterInputStream iis=new InflaterInputStream(fis);

        int size=fis.available();
        byte[] arr=new byte[size];

        iis.read(arr);

        iis.close();
        fis.close();

        String hai=new String(arr);

        System.out.println(file.getName()+" has following content");
        System.out.println(hai);
    }
}
