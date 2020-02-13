package fr.eni.mvc.bean;

import javax.persistence.Entity;

@Entity
public class Actor extends Person {

	private static final long serialVersionUID = 1L;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
