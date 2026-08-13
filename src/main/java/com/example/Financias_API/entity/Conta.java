package com.example.Financias_API.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_contas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "nome_conta", nullable = false)
    private String nomeConta;

    @Column(nullable = false)
    private BigDecimal saldo;

    @Column(name = "tipo_conta", nullable = false)
    private String tipoConta;

}
