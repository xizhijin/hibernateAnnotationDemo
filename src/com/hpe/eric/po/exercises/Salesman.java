package com.hpe.eric.po.exercises;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "salesman")
public class Salesman {
	@Id
	@GenericGenerator(name = "mysqlIncrement", strategy = "increment")
	@GeneratedValue(generator = "mysqlIncrement")
	private long sid;

	@Column
	private String salesName;

	// 双向一对一
	@OneToOne(mappedBy = "salesman")
	private Alias alias;

	// 双向一对多
	@OneToMany(mappedBy = "salesman")
	private Set<CarOrder> carOrders = new HashSet<CarOrder>();

	// 双向多对多
	@ManyToMany(targetEntity = com.hpe.eric.po.exercises.BasicCar.class)
	@JoinTable(
			name = "salesman_basiccar", 
			joinColumns = { @JoinColumn(name = "salesId") }, 
			inverseJoinColumns = { @JoinColumn(name = "carId") })
	private Set<BasicCar> cars = new HashSet<BasicCar>();

	// 映射组件
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "province", column = @Column(name = "province")),
			@AttributeOverride(name = "city", column = @Column(name = "city")),
			@AttributeOverride(name = "street", column = @Column(name = "street")),
			@AttributeOverride(name = "number", column = @Column(name = "number")) })
	private Address address;

	public Salesman() {
	}

	public Salesman(String N) {
		this.salesName = N;
	}

	public long getSid() {
		return this.sid;
	}
	
	public void setSid(long sid) {
		this.sid = sid;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public Alias getAlias() {
		return alias;
	}

	public void setAlias(Alias alias) {
		this.alias = alias;
	}

	public String getSalesName() {
		return salesName;
	}

	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	public Set<CarOrder> getCarOrders() {
		return carOrders;
	}

	public void setCarOrders(Set<CarOrder> carOrders) {
		this.carOrders = carOrders;
	}

	public Set<BasicCar> getCars() {
		return cars;
	}

	public void setCars(Set<BasicCar> cars) {
		this.cars = cars;
	}
	
	
}
