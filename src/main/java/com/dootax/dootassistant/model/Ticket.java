package com.dootax.dootassistant.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "tipoProblema")
    private String tipoProblema;

    @Enumerated(EnumType.STRING)
    @Column(name = "modulo")
    private Modulo modulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "anexos")
    private String anexos;

    @Column(name = "tenant")
    private String tenant;

    @Column(name = "usuario")
    private String usuario;
}
