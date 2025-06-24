package br.edu.ifsul.cstsi.lpoo_objetivo6_aulas.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cursos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sigla;

    //relações com outras classes
    @OneToMany(mappedBy = "curso")
    private List<Usuario> usuarios;

}
