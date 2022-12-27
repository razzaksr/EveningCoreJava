package org.corejava.ceptions;

import java.io.IOException;

public class CheckedSample {
    public static void main(String[] args) throws IOException, InterruptedException {
        //HiFi hi=new HiFi();
//        HiFi hi=HiFi.getHiFi();
//        hi.great();
        Runtime run=Runtime.getRuntime();
        Process pro=run.exec("notepad");
        Thread.sleep(5000);
        pro=run.exec("mspaint");
        Thread.sleep(5000);
        pro=run.exec("calc");

    }
}

class HiFi{
    private static HiFi object=new HiFi();
    private HiFi(){
        System.out.println("Memory created");
    }
    public static HiFi getHiFi(){
        return object;
    }
    public void great(){
        System.out.println("Be grateful to parents");
    }
}