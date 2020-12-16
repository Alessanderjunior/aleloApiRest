package com.example.aleloprojeto.companystorage.service;


import com.example.aleloprojeto.companystorage.dto.CompaniesDTO;
import com.example.aleloprojeto.companystorage.dto.MessageResponseDTO;
import com.example.aleloprojeto.companystorage.entity.Companies;
import com.example.aleloprojeto.companystorage.mapper.CompaniesMapper;
import com.example.aleloprojeto.companystorage.repository.CadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CadService {

    private final CompaniesMapper companiesMapper = CompaniesMapper.INSTANCE;

    private final CadRepository cadRepository;




    @Autowired
    public CadService(CadRepository cadRepository) {

        this.cadRepository = cadRepository;
    }


    public MessageResponseDTO create( CompaniesDTO companyDTO){
        Companies companytosave = CompaniesMapper.INSTANCE.toModel(companyDTO);

        Companies savedCompany = cadRepository.save(companytosave);
        return MessageResponseDTO.builder()
                .message("Company created with ID " + savedCompany.getCompId())
                .build();
    }
}
