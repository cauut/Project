package vn.ifisolution.fresher12.entity;
// Generated Sep 27, 2017 3:33:14 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tickets generated by hbm2java
 */
@Entity
@Table(name = "Tickets", catalog = "ThienAn")
public class Tickets implements java.io.Serializable {

	private Integer ticketNumber;
	private RefTicketStatus refTicketStatus;
	private Violations violations;
	private String dateTicketCabcelled;
	private String dateTicketPaid;
	private String otherTicketDetais;

	public Tickets() {
	}

	public Tickets(RefTicketStatus refTicketStatus, Violations violations, String dateTicketCabcelled,
			String dateTicketPaid, String otherTicketDetais) {
		this.refTicketStatus = refTicketStatus;
		this.violations = violations;
		this.dateTicketCabcelled = dateTicketCabcelled;
		this.dateTicketPaid = dateTicketPaid;
		this.otherTicketDetais = otherTicketDetais;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ticket_number", unique = true, nullable = false)
	public Integer getTicketNumber() {
		return this.ticketNumber;
	}

	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ticket_status_code", nullable = false)
	public RefTicketStatus getRefTicketStatus() {
		return this.refTicketStatus;
	}

	public void setRefTicketStatus(RefTicketStatus refTicketStatus) {
		this.refTicketStatus = refTicketStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "violation_id", nullable = false)
	public Violations getViolations() {
		return this.violations;
	}

	public void setViolations(Violations violations) {
		this.violations = violations;
	}

	@Column(name = "date_ticket_cabcelled", nullable = false, length = 50)
	public String getDateTicketCabcelled() {
		return this.dateTicketCabcelled;
	}

	public void setDateTicketCabcelled(String dateTicketCabcelled) {
		this.dateTicketCabcelled = dateTicketCabcelled;
	}

	@Column(name = "date_ticket_paid", nullable = false, length = 50)
	public String getDateTicketPaid() {
		return this.dateTicketPaid;
	}

	public void setDateTicketPaid(String dateTicketPaid) {
		this.dateTicketPaid = dateTicketPaid;
	}

	@Column(name = "other_ticket_detais", nullable = false, length = 50)
	public String getOtherTicketDetais() {
		return this.otherTicketDetais;
	}

	public void setOtherTicketDetais(String otherTicketDetais) {
		this.otherTicketDetais = otherTicketDetais;
	}

}