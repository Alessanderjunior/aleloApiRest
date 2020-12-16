package com.example.aleloprojeto.companystorage.mapper;


import com.example.aleloprojeto.companystorage.dto.CompaniesDTO;
import com.example.aleloprojeto.companystorage.entity.Companies;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompaniesMapper {

    CompaniesMapper INSTANCE = Mappers.getMapper(CompaniesMapper.class);

    Companies toModel(CompaniesDTO companiesDTO);

    CompaniesDTO toDTO(Companies companies);
}
