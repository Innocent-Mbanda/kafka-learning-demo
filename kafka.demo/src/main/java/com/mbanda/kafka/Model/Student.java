package com.mbanda.kafka.Model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student {
    private int id;
    private String firstName;
    private String lastName;
}
