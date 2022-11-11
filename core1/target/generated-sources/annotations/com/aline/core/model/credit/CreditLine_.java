package com.aline.core.model.credit;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CreditLine.class)
public abstract class CreditLine_ {

	public static volatile SingularAttribute<CreditLine, Float> apr;
	public static volatile SingularAttribute<CreditLine, Integer> minPayment;
	public static volatile SingularAttribute<CreditLine, CreditLineType> creditLineType;
	public static volatile SingularAttribute<CreditLine, Integer> creditLimit;
	public static volatile SingularAttribute<CreditLine, Integer> id;
	public static volatile SingularAttribute<CreditLine, LocalDate> startDate;
	public static volatile SingularAttribute<CreditLine, CreditLineStatus> status;

	public static final String APR = "apr";
	public static final String MIN_PAYMENT = "minPayment";
	public static final String CREDIT_LINE_TYPE = "creditLineType";
	public static final String CREDIT_LIMIT = "creditLimit";
	public static final String ID = "id";
	public static final String START_DATE = "startDate";
	public static final String STATUS = "status";

}

