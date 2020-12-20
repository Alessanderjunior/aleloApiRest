package com.example.aleloprojeto.companystorage.mapper;

import org.mapstruct.Mapper;

import com.example.aleloprojeto.companystorage.dto.CompaniesDTO;
import com.example.aleloprojeto.companystorage.entity.Companies;

@Mapper(componentModel = "spring")
public interface CompaniesMapper {

    Companies toModel(CompaniesDTO companiesDTO);

    CompaniesDTO toDTO(Companies companies);
}
