package com.cognizant.ormlearnformapping.model;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="stock")
public class Stock {
	
	@Id
	@Column(name="st_id")
    private int id;
	
	@Column(name="st_code")
	private String st_code;
	
	@Column(name="st_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date st_date;
	
	@Column(name="st_open")
	private BigDecimal st_open;
	
	@Column(name="st_close")
	private BigDecimal st_close;
	
	@Column(name="st_volume")
	private BigInteger st_volume;
}