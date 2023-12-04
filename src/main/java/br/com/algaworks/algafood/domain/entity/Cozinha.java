package br.com.algaworks.algafood.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode
@Getter @Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //todo ao longo do curso devo mudar o "nome" p/ categoria
    @Column(name = "nome", length = 30 )
    private String nome;

}
