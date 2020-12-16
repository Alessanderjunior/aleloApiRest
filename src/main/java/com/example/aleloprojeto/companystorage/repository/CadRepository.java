package com.example.aleloprojeto.companystorage.repository;
import com.example.aleloprojeto.companystorage.entity.Companies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CadRepository extends JpaRepository<Companies, Long>{
}
