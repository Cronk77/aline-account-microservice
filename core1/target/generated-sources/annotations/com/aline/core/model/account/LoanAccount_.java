package com.aline.core.model.account;

import com.aline.core.model.loan.Loan;
import com.aline.core.model.payment.Payment;
import com.aline.core.model.payment.PaymentRecord;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LoanAccount.class)
public abstract class LoanAccount_ extends com.aline.core.model.account.Account_ {

	public static volatile SingularAttribute<LoanAccount, Loan> loan;
	public static volatile ListAttribute<LoanAccount, Payment> payments;
	public static volatile ListAttribute<LoanAccount, PaymentRecord> paymentHistory;

	public static final String LOAN = "loan";
	public static final String PAYMENTS = "payments";
	public static final String PAYMENT_HISTORY = "paymentHistory";

}

