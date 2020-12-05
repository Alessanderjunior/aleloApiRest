package com.example.aleloprojeto.cadcliente.controller;


import com.example.aleloprojeto.cadcliente.dto.CompaniesDTO;
import com.example.aleloprojeto.cadcliente.dto.MessageResponseDTO;
import com.example.aleloprojeto.cadcliente.entity.Companies;
import com.example.aleloprojeto.cadcliente.repository.CadRepository;
import com.example.aleloprojeto.cadcliente.service.CadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/companies")

//classe responsável pelas requisições http

public class cadController {

    private CadService cadService;

    public cadController(CadService cadService) {
        this.cadService = cadService;
    }

    @Autowired


    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid CompaniesDTO companyDTO){
        return cadService.create(companyDTO);
    }
}
