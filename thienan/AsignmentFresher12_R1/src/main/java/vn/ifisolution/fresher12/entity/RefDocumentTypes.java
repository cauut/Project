package vn.ifisolution.fresher12.entity;
// Generated Sep 27, 2017 3:33:14 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RefDocumentTypes generated by hbm2java
 */
@Entity
@Table(name = "Ref_Document_Types", catalog = "ThienAn")
public class RefDocumentTypes implements java.io.Serializable {

	private Integer documentTypeCode;
	private String documentaionTypeDescription;
	private Set<Violations> violationses = new HashSet<Violations>(0);

	public RefDocumentTypes() {
	}

	public RefDocumentTypes(String documentaionTypeDescription) {
		this.documentaionTypeDescription = documentaionTypeDescription;
	}

	public RefDocumentTypes(String documentaionTypeDescription, Set<Violations> violationses) {
		this.documentaionTypeDescription = documentaionTypeDescription;
		this.violationses = violationses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "document_type_code", unique = true, nullable = false)
	public Integer getDocumentTypeCode() {
		return this.documentTypeCode;
	}

	public void setDocumentTypeCode(Integer documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	@Column(name = "documentaion_type_description", nullable = false, length = 50)
	public String getDocumentaionTypeDescription() {
		return this.documentaionTypeDescription;
	}

	public void setDocumentaionTypeDescription(String documentaionTypeDescription) {
		this.documentaionTypeDescription = documentaionTypeDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refDocumentTypes")
	public Set<Violations> getViolationses() {
		return this.violationses;
	}

	public void setViolationses(Set<Violations> violationses) {
		this.violationses = violationses;
	}

}