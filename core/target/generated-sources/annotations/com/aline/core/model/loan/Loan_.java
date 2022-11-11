package com.aline.core.model.loan;

import com.aline.core.model.account.Account;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Loan.class)
public abstract class Loan_ {

	public static volatile SingularAttribute<Loan, Float> apr;
	public static volatile SingularAttribute<Loan, Integer> amount;
	public static volatile SingularAttribute<Loan, LoanType> loanType;
	public static volatile SingularAttribute<Loan, Account> depositAccount;
	public static volatile SingularAttribute<Loan, Integer> term;
	public static volatile SingularAttribute<Loan, Integer> id;
	public static volatile SingularAttribute<Loan, LocalDate> startDate;
	public static volatile SingularAttribute<Loan, LoanStatus> status;

	public static final String APR = "apr";
	public static final String AMOUNT = "amount";
	public static final String LOAN_TYPE = "loanType";
	public static final String DEPOSIT_ACCOUNT = "depositAccount";
	public static final String TERM = "term";
	public static final String ID = "id";
	public static final String START_DATE = "startDate";
	public static final String STATUS = "status";

}

