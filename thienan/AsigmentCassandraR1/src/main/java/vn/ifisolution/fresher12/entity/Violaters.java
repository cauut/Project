package vn.ifisolution.fresher12.entity;

// Generated Sep 27, 2017 3:33:14 PM by Hibernate Tools 5.2.5.Final

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Violaters generated by hbm2java
 */

@Table("violaters")
public class Violaters implements java.io.Serializable {
	@PrimaryKey
	private int violater_id;
	private Addresses addresses;
	private RefPaymentMethods ref_payment_methods;
	private String violater_name;
	private String violater_phone;
	private String violater_email;
	private String date_of_first_violation;
	private String other_violater_detais;
	public int getViolater_id() {
		return violater_id;
	}
	public void setViolater_id(int violater_id) {
		this.violater_id = violater_id;
	}
	public Addresses getAddresses() {
		return addresses;
	}
	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}
	public RefPaymentMethods getRef_payment_methods() {
		return ref_payment_methods;
	}
	public void setRef_payment_methods(RefPaymentMethods ref_payment_methods) {
		this.ref_payment_methods = ref_payment_methods;
	}
	public String getViolater_name() {
		return violater_name;
	}
	public void setViolater_name(String violater_name) {
		this.violater_name = violater_name;
	}
	public String getViolater_phone() {
		return violater_phone;
	}
	public void setViolater_phone(String violater_phone) {
		this.violater_phone = violater_phone;
	}
	public String getViolater_email() {
		return violater_email;
	}
	public void setViolater_email(String violater_email) {
		this.violater_email = violater_email;
	}
	public String getDate_of_first_violation() {
		return date_of_first_violation;
	}
	public void setDate_of_first_violation(String date_of_first_violation) {
		this.date_of_first_violation = date_of_first_violation;
	}
	public String getOther_violater_detais() {
		return other_violater_detais;
	}
	public void setOther_violater_detais(String other_violater_detais) {
		this.other_violater_detais = other_violater_detais;
	}
	public ViolaterVehicles getViolater_vehicles() {
		return violater_vehicles;
	}
	public void setViolater_vehicles(ViolaterVehicles violater_vehicles) {
		this.violater_vehicles = violater_vehicles;
	}
	public Violaters(int violater_id, Addresses addresses,
			RefPaymentMethods ref_payment_methods, String violater_name,
			String violater_phone, String violater_email,
			String date_of_first_violation, String other_violater_detais,
			ViolaterVehicles violater_vehicles) {
		super();
		this.violater_id = violater_id;
		this.addresses = addresses;
		this.ref_payment_methods = ref_payment_methods;
		this.violater_name = violater_name;
		this.violater_phone = violater_phone;
		this.violater_email = violater_email;
		this.date_of_first_violation = date_of_first_violation;
		this.other_violater_detais = other_violater_detais;
		this.violater_vehicles = violater_vehicles;
	}
	public Violaters() {
		super();
		// TODO Auto-generated constructor stub
	}
	private ViolaterVehicles violater_vehicles;

	
}