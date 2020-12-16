package com.example.aleloprojeto.companystorage.entity;

import javax.persistence.*;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adresId;

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
