package org.corejava.console;

import java.util.Date;
import java.util.List;

public interface Perform {
    public String addEvent(Event obj);
    public String enroll(String eveName, String person);
    public void winner(String eveName,String person);
    public void every();
    public Event getBy(Date date);
    public List<Event> getBy(String dept);
    public String cancel(String name);
}
