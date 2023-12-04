package br.com.algaworks.algafood.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@EqualsAndHashCode
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurante {

    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private String nome;

    @Column(name = "taxa_frete")
    private BigDecimal taxaFrete;
}
