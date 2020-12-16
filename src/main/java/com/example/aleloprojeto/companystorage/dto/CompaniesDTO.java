package com.example.aleloprojeto.companystorage.dto;

import com.example.aleloprojeto.companystorage.entity.Adress;
import com.example.aleloprojeto.companystorage.entity.people;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CompaniesDTO {

    private Integer compId;

    @NotBlank
    @Size(max = 100)
     private String companyName;

    @NotBlank
    @Valid
    private people owner;


    @NotBlank
    @Size(max = 30)
    private String taxType;

    @NotBlank
    @Size(max = 30)
    private String cnpj;


    @Size(max = 30)
    private String stateInsc;


    @Size(max = 30)
    private String municInsc;

    @Valid
    @NotBlank
    private Adress adress;

}
