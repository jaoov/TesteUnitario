package com.generation.Testes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.Testes.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>
{

}
