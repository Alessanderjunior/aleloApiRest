package com.example.aleloprojeto.companystorage.service;

import com.example.aleloprojeto.companystorage.dto.CompaniesDTO;
import com.example.aleloprojeto.companystorage.dto.MessageResponseDTO;

public interface CadService {

    MessageResponseDTO create(CompaniesDTO companyDTO);
}
