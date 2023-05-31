package org.itstep.ls9.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private Long id;

    private String name;

    private String surname;

    private String country;

    private String city;

    private String iin;




}
