package com.aline.core.model.payment;

import com.aline.core.model.Member;
import com.aline.core.model.account.Account;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ {

	public static volatile SingularAttribute<Payment, Integer> amount;
	public static volatile SingularAttribute<Payment, Account> payToAccount;
	public static volatile SingularAttribute<Payment, LocalDate> dueDate;
	public static volatile SingularAttribute<Payment, String> description;
	public static volatile SingularAttribute<Payment, Integer> id;
	public static volatile SingularAttribute<Payment, Member> payer;
	public static volatile SingularAttribute<Payment, PaymentStatus> status;

	public static final String AMOUNT = "amount";
	public static final String PAY_TO_ACCOUNT = "payToAccount";
	public static final String DUE_DATE = "dueDate";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String PAYER = "payer";
	public static final String STATUS = "status";

}

