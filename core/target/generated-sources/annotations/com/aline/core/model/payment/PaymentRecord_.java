package com.aline.core.model.payment;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PaymentRecord.class)
public abstract class PaymentRecord_ {

	public static volatile SingularAttribute<PaymentRecord, LocalDateTime> created;
	public static volatile SingularAttribute<PaymentRecord, Payment> payment;
	public static volatile SingularAttribute<PaymentRecord, Integer> id;
	public static volatile SingularAttribute<PaymentRecord, PaymentStatus> status;

	public static final String CREATED = "created";
	public static final String PAYMENT = "payment";
	public static final String ID = "id";
	public static final String STATUS = "status";

}

