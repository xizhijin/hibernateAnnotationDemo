package com.po.compmapping;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lion {
	@Id
	private int id;

	@Embedded
	private Animal animal;
	public Lion(int id,Animal animal){
		this.id=id;
		this.animal=animal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}