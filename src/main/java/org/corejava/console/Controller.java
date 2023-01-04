package org.corejava.console;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Controller implements Perform{

    private List<Event> eves=new ArrayList<>();
    private File file=new File("D:\\Course backups\\Java\\EveningJava\\myEvents.doc");
    private FileOutputStream fos;
    private FileInputStream fis;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    private void writing(){
        try{
            fos=new FileOutputStream(file);
            oos=new ObjectOutputStream(fos);

            oos.writeObject(eves);

            oos.close();
            fos.close();
        }
        catch (IOException i){}
    }

    private void reading(){
        try{
            fis=new FileInputStream(file);
            ois=new ObjectInputStream(fis);

            eves=(List<Event>)ois.readObject();

            ois.close();
            fis.close();
        }
        catch (IOException | ClassNotFoundException | NullPointerException e){
            //eves=new ArrayList<>();
        }
    }

    public Controller(){
        try {
            if(!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String addEvent(Event obj) {
        reading();
        eves.add(obj);
        writing();
        return obj.getName()+" has saved in the record";
    }

    @Override
    public String enroll(String eveName, String person) {
        reading();
        for(int index=0;index< eves.size();index++){
            if(eves.get(index).getName().equalsIgnoreCase(eveName)){
                eves.get(index).getParticipants().add(person);
                writing();
                return person+" has enrolled in "+eveName;
            }
        }
        return person+" hasn't enrolled in "+eveName;
    }

    @Override
    public void winner(String eveName, String person) {
        reading();
        for(int index=0;index< eves.size();index++){
            if(eves.get(index).getName().equalsIgnoreCase(eveName)){
                if(eves.get(index).getParticipants().contains(person)&&eves.get(index).getWinner()==null){
                    eves.get(index).setWinner(person);
                    System.out.println(person+" has announced as winner in "+eveName);
                    writing();
                    return;
                }
            }
        }
        System.out.println("Invalid event "+eveName+" or Invalid participant "+person);
    }

    @Override
    public void every() {
        reading();
        Iterator<Event> e=eves.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }

    @Override
    public Event getBy(Date date) {
        reading();
        for(Event e:eves){
            if(e.getDate().equals(date))
                return e;
        }
        return null;
    }

    @Override
    public List<Event> getBy(String dept) {
        List<Event> tmp=new ArrayList<>();
        reading();
        for(Event e:eves){
            if(e.getDept().equals(dept))
                tmp.add(e);
        }
        return tmp;
    }

    @Override
    public String cancel(String name) {
        reading();
        for(int index=0;index< eves.size();index++){
            if(eves.get(index).getName().equalsIgnoreCase(name)){
                eves.remove(eves.get(index));
                writing();
                return name+" has cancelled";
            }
        }
        return "Invalid event "+name;
    }
}
