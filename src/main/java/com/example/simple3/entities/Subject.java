package com.example.simple3.entities;
import lombok.*;

@Getter  //Annotation //lombok ช่วยจัดการพื้นฐานของ feature java (constructure , toString)
@Setter //ข้อดีคือ แก้ตัวแปร แล้วไม่ต้องแก้ Getter setter หมด
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Subject {
    private String id;
    private String title;
    private Double credit;
}