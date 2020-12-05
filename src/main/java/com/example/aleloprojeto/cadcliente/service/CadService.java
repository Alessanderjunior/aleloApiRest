package com.example.aleloprojeto.cadcliente.service;


import com.example.aleloprojeto.cadcliente.dto.CompaniesDTO;
import com.example.aleloprojeto.cadcliente.dto.MessageResponseDTO;
import com.example.aleloprojeto.cadcliente.entity.Companies;
import com.example.aleloprojeto.cadcliente.mapper.CompaniesMapper;
import com.example.aleloprojeto.cadcliente.repository.CadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CadService {

    private final CompaniesMapper companiesMapper = CompaniesMapper.INSTANCE;

    private final CadRepository cadRepository;

    //classe responsável pela criação de empresas


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
