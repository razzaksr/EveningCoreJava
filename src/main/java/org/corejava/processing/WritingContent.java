package org.corejava.processing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingContent {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Course backups\\Java\\EveningJava\\myWrite.doc");
        //FileOutputStream fos=new FileOutputStream("D:\\Course backups\\Java\\EveningJava\\myWrite.doc");
        FileOutputStream fos=new FileOutputStream(file);

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the content to save in file "+file.getName());
        String plain=scanner.nextLine();
        fos.write(plain.getBytes());

        fos.close();

        System.out.println(file.getName()+" saved with user content");
        scanner.close();
    }
}
