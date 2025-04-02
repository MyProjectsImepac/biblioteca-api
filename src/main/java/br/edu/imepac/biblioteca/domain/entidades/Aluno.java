package br.edu.imepac.biblioteca.domain.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alunos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private Long id;
    private String nome;
    private String matricula;
    private String email;
}
