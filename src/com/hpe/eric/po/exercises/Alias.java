package com.hpe.eric.po.exercises;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "alias")
public class Alias {

	@Id
	@GenericGenerator(name = "mysqlIncrement", strategy = "increment")
	@GeneratedValue(generator = "mysqlIncrement")
	private long aid;

	@Column
	private String aliasName;

	@Column
	private Long amoney;

	@Version
	@Column(name = "version", nullable = false, unique = true)
	private int version;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Salesman salesman;

	public Alias() {
	}
	
	public Alias(String aliasName) {
		this.aliasName = aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public long getAid() {
		return aid;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getVersion() {
		return version;
	}

	public void setAmoney(Long amoney) {
		this.amoney = amoney;
	}

	public Long getAmoney() {
		return amoney;
	}
}
