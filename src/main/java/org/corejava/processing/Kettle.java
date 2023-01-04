package org.corejava.processing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kettle implements Serializable {
    private String brand;
    private int capacity;
    private int price;
}
