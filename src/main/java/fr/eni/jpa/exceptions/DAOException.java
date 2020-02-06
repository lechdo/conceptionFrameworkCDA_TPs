package fr.eni.jpa.exceptions;

@SuppressWarnings("serial")
public class DAOException extends Exception {

	public DAOException() {
		super("Pb au niveau de la DAO");
		// TODO Auto-generated constructor stub
	}

	public DAOException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
}
