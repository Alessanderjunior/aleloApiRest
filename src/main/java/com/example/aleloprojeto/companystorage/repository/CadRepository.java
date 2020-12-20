package com.example.aleloprojeto.companystorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aleloprojeto.companystorage.entity.Companies;

@Repository
public interface CadRepository extends JpaRepository<Companies, Long> {
}
