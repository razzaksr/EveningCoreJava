package org.corejava;

import org.corejava.console.Controller;
import org.corejava.console.Event;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Controller controller=new Controller();

        Scanner scanner=new Scanner(System.in);
        String choice="";
        do{
            System.out.println("1.new\n2.enroll\n3.declare\n4.filter\n5.cancel\n6.Available\nExit to any");
            choice= scanner.next();
            switch (choice){
                case "new":
                    System.out.println("Create new event by id, name, department name and date(MM/DD/YYYY)");
                    Event e=new Event();
                    e.setId(scanner.nextInt());
                    e.setName(scanner.next());
                    e.setDept(scanner.next());
                    e.setDate(new Date(scanner.next()));
                    System.out.println(controller.addEvent(e));
                    break;
                case "enroll":
                    System.out.println("Enter the event name and person wish to participate");
                    System.out.println(controller.enroll(scanner.next(), scanner.next()));
                    break;
                case "declare":
                    System.out.println("Enter the event name and participant to declare as winner");
                    controller.winner(scanner.next(), scanner.next());
                    break;
                case "filter":
                    System.out.println("Tell us based date or department to filter");
                    String tmp=scanner.next();
                    if(tmp.equalsIgnoreCase("department")){
                        System.out.println("Enter the department name ");
                        System.out.println(controller.getBy(scanner.next()));
                    }
                    else if(tmp.equalsIgnoreCase("date")){
                        System.out.println("Enter the date to filter ");
                        System.out.println(controller.getBy(new Date(scanner.next())));
                    }
                    else{
                        System.out.println("Invalid filter");
                    }
                    break;
                case "cancel":
                    System.out.println("Tell us event name to cancel ");
                    System.out.println(controller.cancel(scanner.next()));
                    break;
                case "available":
                    controller.every();
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }
        }while(true);

//        Event e1=new Event(2302,"Innovates23","IT",new Date("1/25/2023"));
//        System.out.println(controller.addEvent(e1));
        //System.out.println(e1);

        //System.out.println(controller.enroll("Picconet23","Sabari"));

//        controller.winner("Picconet23","Manoj");
//        controller.winner("Innovates23","Manoj");
//        controller.winner("Innovates23","Annamalai");

//        controller.every();
//        System.out.println(controller.getBy(new Date("1/20/2023")));
//        System.out.println(controller.getBy("CSE"));
//        System.out.println(controller.getBy("ECE"));

//        System.out.println(controller.cancel("Picconet23"));
    }
}
