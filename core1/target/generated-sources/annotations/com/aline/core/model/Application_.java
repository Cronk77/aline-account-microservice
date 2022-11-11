package com.aline.core.model;

import com.aline.core.model.account.Account;
import com.aline.core.model.credit.CreditCardOffer;
import com.aline.core.model.loan.LoanType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Application.class)
public abstract class Application_ {

	public static volatile SingularAttribute<Application, CreditCardOffer> cardOffer;
	public static volatile SingularAttribute<Application, ApplicationType> applicationType;
	public static volatile SingularAttribute<Application, ApplicationStatus> applicationStatus;
	public static volatile SingularAttribute<Application, Applicant> primaryApplicant;
	public static volatile SingularAttribute<Application, LoanType> loanType;
	public static volatile SingularAttribute<Application, Integer> applicationAmount;
	public static volatile SingularAttribute<Application, Account> depositAccount;
	public static volatile SetAttribute<Application, Applicant> applicants;
	public static volatile SingularAttribute<Application, Long> id;

	public static final String CARD_OFFER = "cardOffer";
	public static final String APPLICATION_TYPE = "applicationType";
	public static final String APPLICATION_STATUS = "applicationStatus";
	public static final String PRIMARY_APPLICANT = "primaryApplicant";
	public static final String LOAN_TYPE = "loanType";
	public static final String APPLICATION_AMOUNT = "applicationAmount";
	public static final String DEPOSIT_ACCOUNT = "depositAccount";
	public static final String APPLICANTS = "applicants";
	public static final String ID = "id";

}

