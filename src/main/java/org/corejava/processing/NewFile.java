package org.corejava.processing;

import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) throws IOException {
        File obj=new File("D:\\Course backups\\Java\\EveningJava\\simpletext.txt");
        obj.createNewFile();
        System.out.println(obj.getAbsoluteFile());
        System.out.println(obj.getName());
        System.out.println(obj.getAbsolutePath());
    }
}