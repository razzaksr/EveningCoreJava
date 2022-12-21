package org.corejava.oops;

import java.util.Arrays;

public class DemoMultiple extends Delta implements Wesley {
    double[] seek={5.6,12.4,9.5,4500.5,12.500};

    public static void main(String[] args) {
        DemoMultiple demo=new DemoMultiple();
        demo.chikago();
        System.out.println(Arrays.toString(demo.seek));
        demo.findNReplace(5);
        System.out.println(Arrays.toString(demo.seek));
    }

    @Override
    public void findNReplace(int criteria) {
        for(int index=0;index<seek.length;index++){
            if(seek[index]>=criteria){
                seek[index]-=(seek[index]*0.050);
            }
        }
    }
}

class Delta{
    public void chikago(){
        System.out.println("Where 90% lands belong to Britten");
    }
}

interface Wesley{
    public void findNReplace(int criteria);
}

class Alpha{
    public void chennai(){
        System.out.println("Where 60% people are not native chennaians");
    }
}