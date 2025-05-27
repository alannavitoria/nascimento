package com.piaget.nascimento.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piaget.nascimento.Interface.AlunoRepository;
import com.piaget.nascimento.Model.Aluno;

@Service

public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> buscarAlunos(){
        return alunoRepository.findAll();
    }

    public Aluno salvAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno buscaAlunoId(Long id){
        return alunoRepository.findById(id).orElse(null);
    }

    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }


}
