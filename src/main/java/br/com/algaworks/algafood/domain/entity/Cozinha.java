package br.com.algaworks.algafood.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter @Setter
@Entity
@Table(name = "tab_cozinha")
public class Cozinha {

    @Id
    private Long id;

    //todo ao longo do curso devo mudar o "nome" p/ categoria
    @Column(name = "nome_cat_cozinha")
    private String nome;

}
