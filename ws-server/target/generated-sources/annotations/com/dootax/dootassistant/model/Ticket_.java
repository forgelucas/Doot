package com.dootax.dootassistant.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ticket.class)
public abstract class Ticket_ {

	public static volatile SingularAttribute<Ticket, String> telefone;
	public static volatile SingularAttribute<Ticket, String> anexos;
	public static volatile SingularAttribute<Ticket, String> tipoProblema;
	public static volatile SingularAttribute<Ticket, String> usuario;
	public static volatile SingularAttribute<Ticket, Integer> id;
	public static volatile SingularAttribute<Ticket, Modulo> modulo;
	public static volatile SingularAttribute<Ticket, String> email;
	public static volatile SingularAttribute<Ticket, String> tenant;
	public static volatile SingularAttribute<Ticket, String> descricao;

	public static final String TELEFONE = "telefone";
	public static final String ANEXOS = "anexos";
	public static final String TIPO_PROBLEMA = "tipoProblema";
	public static final String USUARIO = "usuario";
	public static final String ID = "id";
	public static final String MODULO = "modulo";
	public static final String EMAIL = "email";
	public static final String TENANT = "tenant";
	public static final String DESCRICAO = "descricao";

}

