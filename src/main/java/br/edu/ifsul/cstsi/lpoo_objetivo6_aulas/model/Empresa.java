package br.edu.ifsul.cstsi.lpoo_objetivo6_aulas.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private List<String> tecnologias;
    private String endereco;
    private String cep;
    private double latitude;
    private double longitude;
    private String urlFoto;

    //relações com outras classes
    @OneToMany(mappedBy = "empresa")
    private List<Usuario> colaboradores;
}
