package vn.edu.eiu.lab4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Payment {
    private int id;
    private double amount;
    private String methodName;
}
