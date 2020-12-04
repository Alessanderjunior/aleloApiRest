package com.example.aleloprojeto.cadcliente.repository;
import com.example.aleloprojeto.cadcliente.entity.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

//classe de iniciação de repositório

public interface CadRepository extends JpaRepository<Companies, Long>{
}
