package org.corejava.oops;

public class DemoHybrid extends Organise implements Wesley{
    public static void main(String[] args) {
        DemoHybrid org=new DemoHybrid();
        System.out.println(org.insert(98.5));
        System.out.println(org.insert(4.5));
        System.out.println(org.insert(3.1));
        System.out.println(org.insert(3.8));
        System.out.println(org.insert(12.5));
        System.out.println(org.insert(7.2));
        System.out.println(org.insert(6.7));
        System.out.println(org.insert(11.4));
        System.out.println(org.insert(4.4));

        org.show();

        System.out.println(org.linear(7.8));
        System.out.println(org.linear(6.7));

        System.out.println(org.linear(3,7,4.5));
        System.out.println(org.linear(5,9,11.4));
        System.out.println(org.linear(5,9,0.0));

        org.findNReplace(5);

        org.show();
    }

    @Override
    public void findNReplace(int criteria) {
        for(int index=0;index< getArr().length;index++){
            if(getArr()[index]>=criteria){
                getArr()[index]-=(getArr()[index]*0.050);
            }
        }
    }
}
