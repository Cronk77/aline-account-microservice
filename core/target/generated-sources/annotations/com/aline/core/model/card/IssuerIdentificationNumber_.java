package com.aline.core.model.card;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IssuerIdentificationNumber.class)
public abstract class IssuerIdentificationNumber_ {

	public static volatile SingularAttribute<IssuerIdentificationNumber, String> iin;
	public static volatile SingularAttribute<IssuerIdentificationNumber, CardIssuer> cardIssuer;

	public static final String IIN = "iin";
	public static final String CARD_ISSUER = "cardIssuer";

}

