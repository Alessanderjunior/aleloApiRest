package com.example.aleloprojeto.cadcliente.repository;
import com.example.aleloprojeto.cadcliente.entity.Companies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//classe de iniciação de repositório


@Repository
public interface CadRepository extends JpaRepository<Companies, Long>{
}
