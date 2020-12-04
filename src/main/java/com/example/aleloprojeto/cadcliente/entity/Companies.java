package com.example.aleloprojeto.cadcliente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer compId;

    @Column(nullable = false, unique = true)
    private String companyName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "author_id")
    private people owner;



    @Column(nullable = false)
    private String taxType;

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = true)
    private String stateInsc;

    @Column(nullable = true)
    private String municInsc;

    @Column(nullable = false)
    private Adress adress;

    @Column(nullable = true)
    private String monthPay;
}
