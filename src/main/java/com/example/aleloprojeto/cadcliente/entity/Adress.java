package com.example.aleloprojeto.cadcliente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adress {

    @Column(nullable = false)
    private String street;

    @Column(nullable = true)
    private Integer houseNum;

    @Column(nullable = false)
    private String nbhd;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String Complement;
}
