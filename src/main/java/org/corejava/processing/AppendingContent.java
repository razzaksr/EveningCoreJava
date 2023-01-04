package org.corejava.processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendingContent {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Course backups\\Java\\EveningJava\\myWrite.doc");
        FileInputStream fis=new FileInputStream(file);
        int count=fis.available();
        byte[] arr=new byte[count];
        fis.read(arr);
        fis.close();

        String exist=new String(arr);
        FileOutputStream fos=new FileOutputStream(file);
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the content to save in file "+file.getName());
        String plain=scanner.nextLine();
        exist=exist.concat(" "+plain);
        fos.write(exist.getBytes());

        scanner.close();
        fos.close();

    }
}
