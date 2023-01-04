package org.corejava.processing;

import java.io.*;

public class ReadingObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("D:\\Course backups\\Java\\EveningJava\\myObjs.doc");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=null;
        Kettle tmp=null;

        try{
            ois=new ObjectInputStream(fis);
            tmp=(Kettle)ois.readObject();
            ois.close();
        }
        catch (EOFException | NullPointerException e){
            System.out.println("No Object available");
        }
        fis.close();

        System.out.println(tmp+" was the content in "+file.getName());
    }
}
