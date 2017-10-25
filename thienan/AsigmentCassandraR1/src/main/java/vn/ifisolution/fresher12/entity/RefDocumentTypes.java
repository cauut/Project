package vn.ifisolution.fresher12.entity;
// Generated Sep 27, 2017 3:33:14 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * RefDocumentTypes generated by hbm2java
 */

@Table("ref_Document_Types")
public class RefDocumentTypes implements java.io.Serializable {
   @PrimaryKey
	private Integer document_type_code;
	private String documentaion_type_description;
	public Integer getDocument_type_code() {
		return document_type_code;
	}
	public void setDocument_type_code(Integer document_type_code) {
		this.document_type_code = document_type_code;
	}
	public String getDocumentaion_type_description() {
		return documentaion_type_description;
	}
	public void setDocumentaion_type_description(
			String documentaion_type_description) {
		this.documentaion_type_description = documentaion_type_description;
	}
	public Set<Violations> getViolationses() {
		return violationses;
	}
	public void setViolationses(Set<Violations> violationses) {
		this.violationses = violationses;
	}
	@Override
	public String toString() {
		return "RefDocumentTypes [document_type_code=" + document_type_code
				+ ", documentaion_type_description="
				+ documentaion_type_description + ", violationses="
				+ violationses + "]";
	}
	public RefDocumentTypes(Integer document_type_code,
			String documentaion_type_description, Set<Violations> violationses) {
		super();
		this.document_type_code = document_type_code;
		this.documentaion_type_description = documentaion_type_description;
		this.violationses = violationses;
	}
	private Set<Violations> violationses = new HashSet<Violations>(0);
	public RefDocumentTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
