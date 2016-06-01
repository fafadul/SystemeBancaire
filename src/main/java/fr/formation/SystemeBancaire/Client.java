package fr.formation.SystemeBancaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @version 1.0
 * @author fadul
 */
public class Client {
	
	/**
	 * variables
	 */
	private String firstName;
	private String name;
	private int numeroCompte;
	private double solde;
	
	//Constructor
	public Client(String firstName, String name, int numeroCompte) {
		if (firstName.isEmpty() || name.isEmpty()) {
			throw new IllegalArgumentException("The name or the first name are empty!");
		}
		this.name = name;
		this.firstName = firstName;
		this.numeroCompte = numeroCompte;
	}
	
	/**
	 * Getters and Setters
	 * for firstName, name, numeroCompte, solde
	 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
	public double getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public void afficherSolde() {
		System.out.println("Solde = "+solde);
	}
	
	/**
	 * Connection to the bd and show the balance
	 * @throws SQLException
	 */
	public void getSoldeFromDb() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/test"; 
		String user = "admin"; 
		String passwd = "admin"; 
		Connection connection = DriverManager.getConnection(url, user, passwd);
		
		Statement statement = connection.createStatement(); 
		ResultSet resultSet = statement.executeQuery("SELECT solde FROM client WHERE numero_compte ="+numeroCompte);
		
		while (resultSet.next()) { 
			solde = resultSet.getDouble("solde");
		}
		afficherSolde();
	}
	
}
