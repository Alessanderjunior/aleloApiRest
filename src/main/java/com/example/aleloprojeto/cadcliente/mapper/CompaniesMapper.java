package com.example.aleloprojeto.cadcliente.mapper;


import com.example.aleloprojeto.cadcliente.dto.CompaniesDTO;
import com.example.aleloprojeto.cadcliente.entity.Companies;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompaniesMapper {

    CompaniesMapper INSTANCE = Mappers.getMapper(CompaniesMapper.class);

    Companies toModel(CompaniesDTO companiesDTO);

    CompaniesDTO toDTO(Companies companies);
}
