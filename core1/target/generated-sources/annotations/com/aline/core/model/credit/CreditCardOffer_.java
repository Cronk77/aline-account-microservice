package com.aline.core.model.credit;

import com.aline.core.model.card.CardIssuer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CreditCardOffer.class)
public abstract class CreditCardOffer_ {

	public static volatile SingularAttribute<CreditCardOffer, Float> maxApr;
	public static volatile SingularAttribute<CreditCardOffer, Integer> amount;
	public static volatile SingularAttribute<CreditCardOffer, String> offerName;
	public static volatile SingularAttribute<CreditCardOffer, Integer> minPayment;
	public static volatile SingularAttribute<CreditCardOffer, CreditLineType> creditLineType;
	public static volatile SingularAttribute<CreditCardOffer, String> description;
	public static volatile SingularAttribute<CreditCardOffer, Integer> id;
	public static volatile SingularAttribute<CreditCardOffer, Float> minApr;
	public static volatile SingularAttribute<CreditCardOffer, CardIssuer> cardIssuer;

	public static final String MAX_APR = "maxApr";
	public static final String AMOUNT = "amount";
	public static final String OFFER_NAME = "offerName";
	public static final String MIN_PAYMENT = "minPayment";
	public static final String CREDIT_LINE_TYPE = "creditLineType";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String MIN_APR = "minApr";
	public static final String CARD_ISSUER = "cardIssuer";

}

