package com.cognizant.ormlearnformapping.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Employee")
@Table(name = "employee", schema = "ormlearn")
public class Employee {

	// day 2 handson 3 declaring the variables, annotions and creating repo's
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "em_id")
	private int id;

	@Column(name = "em_name")
	private String name;

	@Column(name = "em_salary")
	private BigDecimal salary;

	@Column(name = "em_permanent")
	private boolean permanent;

	@Column(name = "em_date_of_birth")
	private Date dateOfBirth;

	// handson 4

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "em_dp_id")
	private Department department;

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "employee_skill", joinColumns = @JoinColumn(name = "es_em_id"), inverseJoinColumns = @JoinColumn(name = "es_sk_id"))
	private Set<Skill> skillList;

}
