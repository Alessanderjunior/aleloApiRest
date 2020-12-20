package com.example.aleloprojeto.companystorage.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compId;

    @Column(nullable = false, unique = true)
    private String companyName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
    @JoinColumn(name = "owner_id")
    private People owner;

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

}
