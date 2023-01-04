package org.corejava.processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingContent {
    public static void main(String[] args) throws IOException {
        //File file=new File("D:\\Course backups\\Java\\EveningJava\\myWrite.doc");
        File file=new File("D:\\Course backups\\Javascript\\BhuvanaFlaskReact\\flask-front\\src\\App.js");
        FileInputStream fis=new FileInputStream(file);

        int count=fis.available();
        byte[] arr=new byte[count];

        fis.read(arr);
        fis.close();

        String data=new String(arr);

        System.out.println(file.getName()+" has following content");
        System.out.println(data);
    }
}
