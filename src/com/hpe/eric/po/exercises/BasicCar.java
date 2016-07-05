package com.hpe.eric.po.exercises;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


@Entity  
@Table(name="basiccar") 
public class BasicCar {
	@Id
	@GenericGenerator(name = "mysqlIncrement", strategy = "increment")
	@GeneratedValue(generator = "mysqlIncrement")
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "factory", length = 50)
	@Lob
	private String factory;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE) // @Temporal(TemporalType.TIME)³ö´íData truncated for column 'date' at row 1
	@Basic(fetch = FetchType.LAZY)
	private Date date;

	@ManyToMany(targetEntity = com.hpe.eric.po.exercises.Salesman.class)
	private Set<Salesman> salesmans = new HashSet<Salesman>();

	public BasicCar() {
	}

	public BasicCar(String N) {
		this.name = N;
	}

	public BasicCar(String name, String factory, Date date) {
		this.name = name;
		this.factory = factory;
		this.date = date;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean eauals(Object o) {

		if (this == o)
			return true;

		if (!(o instanceof BasicCar))
			return false;

		final BasicCar other = (BasicCar) o;
		if (this.getName().equals(other.getName()) && this.getDate().equals(other.getDate())
				&& this.getFactory().equals(other.getFactory()))
			return true;
		else
			return false;
	}

	public void setSalesmans(Set<Salesman> salesmans) {
		this.salesmans = salesmans;
	}

	public Set<Salesman> getSalesmans() {
		return salesmans;
	}
}
