package com.aline.core.model.card;

import com.aline.core.model.Member;
import com.aline.core.model.account.Account;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Card.class)
public abstract class Card_ {

	public static volatile SingularAttribute<Card, CardType> cardType;
	public static volatile SingularAttribute<Card, Member> cardHolder;
	public static volatile SingularAttribute<Card, String> securityCode;
	public static volatile SingularAttribute<Card, Long> id;
	public static volatile SingularAttribute<Card, CardStatus> cardStatus;
	public static volatile SingularAttribute<Card, Account> account;
	public static volatile SingularAttribute<Card, String> cardNumber;
	public static volatile SingularAttribute<Card, LocalDate> expirationDate;
	public static volatile SingularAttribute<Card, CardIssuer> cardIssuer;

	public static final String CARD_TYPE = "cardType";
	public static final String CARD_HOLDER = "cardHolder";
	public static final String SECURITY_CODE = "securityCode";
	public static final String ID = "id";
	public static final String CARD_STATUS = "cardStatus";
	public static final String ACCOUNT = "account";
	public static final String CARD_NUMBER = "cardNumber";
	public static final String EXPIRATION_DATE = "expirationDate";
	public static final String CARD_ISSUER = "cardIssuer";

}

