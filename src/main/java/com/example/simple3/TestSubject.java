package com.example.simple3;


import com.example.simple3.entities.Subject;

public class TestSubject {
    public static void main(String[] args) {
        Subject a = new Subject("021","test",2.0) ;
        System.out.printf("id: %s , Title : %s ",a.getId(),a.getTitle());
    }
}
