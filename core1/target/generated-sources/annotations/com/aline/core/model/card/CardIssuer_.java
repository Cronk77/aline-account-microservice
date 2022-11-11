package com.aline.core.model.card;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CardIssuer.class)
public abstract class CardIssuer_ {

	public static volatile SingularAttribute<CardIssuer, Integer> cardNumberLength;
	public static volatile SingularAttribute<CardIssuer, String> issuerName;

	public static final String CARD_NUMBER_LENGTH = "cardNumberLength";
	public static final String ISSUER_NAME = "issuerName";

}

