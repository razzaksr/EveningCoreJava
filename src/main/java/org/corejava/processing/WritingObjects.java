package org.corejava.processing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjects {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Course backups\\Java\\EveningJava\\myObjs.doc");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Kettle ket1=new Kettle("Preethi",2,1500);
        oos.writeObject(ket1);

        oos.close();
        fos.close();

        System.out.println(ket1+" has saved in "+file.getName());
    }
}
