package vn.ifisolution.fresher12.entity;

// Generated Sep 27, 2017 3:33:14 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Vehicles generated by hbm2java
 */

@Table("vehicles")
public class Vehicles implements java.io.Serializable {
	@PrimaryKey
	private Integer vehicle_licence_number;
	private RefVehicleManufacturers ref_vehicle_manufacturers;
	private RefVehicleTypes ref_vehicle_types;
	private String year_of_manufacture;
	private String vehicle_details;
	private String model;
	public Integer getVehicle_licence_number() {
		return vehicle_licence_number;
	}
	public void setVehicle_licence_number(Integer vehicle_licence_number) {
		this.vehicle_licence_number = vehicle_licence_number;
	}
	public RefVehicleManufacturers getRef_vehicle_manufacturers() {
		return ref_vehicle_manufacturers;
	}
	public void setRef_vehicle_manufacturers(
			RefVehicleManufacturers ref_vehicle_manufacturers) {
		this.ref_vehicle_manufacturers = ref_vehicle_manufacturers;
	}
	public RefVehicleTypes getRef_vehicle_types() {
		return ref_vehicle_types;
	}
	public void setRef_vehicle_types(RefVehicleTypes ref_vehicle_types) {
		this.ref_vehicle_types = ref_vehicle_types;
	}
	public String getYear_of_manufacture() {
		return year_of_manufacture;
	}
	public void setYear_of_manufacture(String year_of_manufacture) {
		this.year_of_manufacture = year_of_manufacture;
	}
	public String getVehicle_details() {
		return vehicle_details;
	}
	public void setVehicle_details(String vehicle_details) {
		this.vehicle_details = vehicle_details;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicles(Integer vehicle_licence_number,
			RefVehicleManufacturers ref_vehicle_manufacturers,
			RefVehicleTypes ref_vehicle_types, String year_of_manufacture,
			String vehicle_details, String model) {
		super();
		this.vehicle_licence_number = vehicle_licence_number;
		this.ref_vehicle_manufacturers = ref_vehicle_manufacturers;
		this.ref_vehicle_types = ref_vehicle_types;
		this.year_of_manufacture = year_of_manufacture;
		this.vehicle_details = vehicle_details;
		this.model = model;
	}
	
}