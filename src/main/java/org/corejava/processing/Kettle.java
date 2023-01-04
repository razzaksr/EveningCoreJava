package org.corejava.processing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kettle {
    private String brand;
    private int capacity;
    private int price;
}
