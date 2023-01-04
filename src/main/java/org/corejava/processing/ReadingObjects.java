package org.corejava.processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("D:\\Course backups\\Java\\EveningJava\\myObjs.doc");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        Kettle tmp=(Kettle)ois.readObject();

        ois.close();
        fis.close();

        System.out.println(tmp+" was the content in "+file.getName());
    }
}
