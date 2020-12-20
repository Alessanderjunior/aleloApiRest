package com.example.aleloprojeto.companystorage.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aleloprojeto.companystorage.dto.CompaniesDTO;
import com.example.aleloprojeto.companystorage.dto.MessageResponseDTO;
import com.example.aleloprojeto.companystorage.service.impl.CadServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/companies")
public class cadController {

    @Autowired
    private CadServiceImpl cadService;

    @ApiOperation(value = "Return an example hello world")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success method return") })
    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid CompaniesDTO companyDTO) {
	return cadService.create(companyDTO);
    }
}
