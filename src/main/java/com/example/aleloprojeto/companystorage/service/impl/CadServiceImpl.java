package com.example.aleloprojeto.companystorage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aleloprojeto.companystorage.dto.CompaniesDTO;
import com.example.aleloprojeto.companystorage.dto.MessageResponseDTO;
import com.example.aleloprojeto.companystorage.entity.Companies;
import com.example.aleloprojeto.companystorage.mapper.CompaniesMapper;
import com.example.aleloprojeto.companystorage.repository.CadRepository;
import com.example.aleloprojeto.companystorage.service.CadService;

@Service
public class CadServiceImpl implements CadService {

    @Autowired
    private CompaniesMapper companiesMapper;

    @Autowired
    private CadRepository cadRepository;

    public MessageResponseDTO create(CompaniesDTO companyDTO) {
	Companies companytosave = companiesMapper.toModel(companyDTO);

	cadRepository.save(companytosave);
	return MessageResponseDTO.builder().message("Company created ").build();
    }
}
