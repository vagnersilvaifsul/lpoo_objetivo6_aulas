package br.edu.ifsul.cstsi.lpoo_objetivo6_aulas.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nome;
    private String urlFoto;

    //relações com outras classes
    @ManyToOne
    private Curso curso;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    @OneToMany
    private List<Usuario> contatos;
    @ManyToOne
    private Empresa empresa;
}
