package org.corejava.console;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event implements Serializable {
    private int id;
    private String name;
    private String dept;
    private String winner;
    private Collection<String> participants=new ArrayList<>();
    private Date date;

    public Event(int id, String name, String dept, Date date) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.date = date;
    }
}
