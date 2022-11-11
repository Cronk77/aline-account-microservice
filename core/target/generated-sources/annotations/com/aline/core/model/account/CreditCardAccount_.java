package com.aline.core.model.account;

import com.aline.core.model.credit.CreditLine;
import com.aline.core.model.payment.Payment;
import com.aline.core.model.payment.PaymentRecord;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CreditCardAccount.class)
public abstract class CreditCardAccount_ extends com.aline.core.model.account.Account_ {

	public static volatile SingularAttribute<CreditCardAccount, CreditLine> creditLine;
	public static volatile ListAttribute<CreditCardAccount, Payment> payments;
	public static volatile ListAttribute<CreditCardAccount, PaymentRecord> paymentHistory;

	public static final String CREDIT_LINE = "creditLine";
	public static final String PAYMENTS = "payments";
	public static final String PAYMENT_HISTORY = "paymentHistory";

}

