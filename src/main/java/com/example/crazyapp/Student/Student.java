package com.example.crazyapp.Student;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private String email;
    private Gender gender;


}
