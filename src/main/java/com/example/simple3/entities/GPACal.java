package com.example.simple3.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GPACal {
    private Double Score;

    public String calculat(Double score) {


        if (score >= 80) {
            return "A";
        } if (score >= 70) {
            return "B";
        } if (score >= 60) {
            return "C";
        }

            return "D";


    }
}
