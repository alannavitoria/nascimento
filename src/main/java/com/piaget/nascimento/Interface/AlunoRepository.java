package com.piaget.nascimento.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piaget.nascimento.Model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
