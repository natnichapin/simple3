package com.example.simple3.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calculate {
    private Double a ;
    private Double b ;

    public  Double add (){
        return a+b ;
    }
    public  Double subtract (){
        return a-b ;
    }
    public  Double Multiple (){
        return a*b ;
    }
    public  Double Divided (){
        return a/b ;
    }

}
