package cs544.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.CreditCardNumber;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CreditCard {
	@Id
	@GeneratedValue
	private int id;
	@CreditCardNumber
	private String ccNo;
	private String name;
	private String expiredDate;
	@OneToOne(cascade={CascadeType.ALL})
	private Address billingAddress;
	
	
	public CreditCard(){}
	
	public CreditCard(String ccNo, String name, String expiredDate, Address billingAddress) {
		super();
		this.ccNo = ccNo;
		this.name = name;
		this.expiredDate = expiredDate;
		this.billingAddress = billingAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	
}
