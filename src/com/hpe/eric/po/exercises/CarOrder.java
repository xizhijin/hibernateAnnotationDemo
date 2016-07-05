package com.hpe.eric.po.exercises;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "carorder")
public class CarOrder {
	@Id
	@GenericGenerator(name = "mysqlIncrement", strategy = "increment")
	@GeneratedValue(generator = "mysqlIncrement")
	private long cid;

	@Column
	private String carName;

	@ManyToOne
	@JoinColumn(name = "salesId")
	private Salesman salesman;

	public CarOrder() {
	}

	public CarOrder(String name) {
		this.carName = name;
	}

	public long getCid() {
		return this.cid;
	}

	public void setCid(long id) {
		this.cid = id;
	}

	public String getCarName() {
		return this.carName;
	}

	public void setCarName(String cName) {
		this.carName = cName;
	}

	public Salesman getSalesman() {
		return this.salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}
}
