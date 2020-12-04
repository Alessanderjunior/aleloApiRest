package com.example.aleloprojeto.cadcliente.service;


import com.example.aleloprojeto.cadcliente.dto.MessageResponseDTO;
import com.example.aleloprojeto.cadcliente.entity.Companies;
import com.example.aleloprojeto.cadcliente.repository.CadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CadService {

    private CadRepository cadRepository;

    //classe responsável pela criação de empresas


    @Autowired
    public CadService(CadRepository cadRepository) {
        this.cadRepository = cadRepository;
    }

    @PostMapping
    public MessageResponseDTO create( Companies company){
        Companies savedCompany = cadRepository.save(company);
        return MessageResponseDTO.builder()
                .message("Company created with ID " + savedCompany.getCompId())
                .build();
    }
}
