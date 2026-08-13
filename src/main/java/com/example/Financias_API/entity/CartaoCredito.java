package com.example.Financias_API.entity;

import java.util.UUID;
import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cartao_credito")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class CartaoCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "nome_cartao", nullable = false)
    private String nomeCartao;

    @Column(name = "limite", nullable = false)
    private BigDecimal limite;

    @Column(name = "data_vencimento", nullable = false)
    private Integer dataVencimento;

    @Column(name = "data_fechamento", nullable = false)
    private Integer dataFechamento;

}
