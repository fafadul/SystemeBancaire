package fr.formation.SystemeBancaire;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the class Client
 * 
 * @author fadul
 */
public class ClientTest {

	/**
	 * Test for creation of a client with a last name and a first name
	 */
	@Test
	public void shouldCreateClient() {

		// GIVEN
		String firstName = "Daffy"; // Prénom
		String name = "Duck"; // Nom
		int numeroCompte = 332;
		Client client1 = new Client(firstName, name, numeroCompte);

		// WHEN
		String clientName = client1.getName();
		String clientFirstName = client1.getFirstName();
		int clientNumeroCompte = client1.getNumeroCompte();

		// THEN
		assertEquals(client1.getFirstName(), "Daffy");
		assertEquals(client1.getName(), "Duck");
		assertEquals(client1.getNumeroCompte(), 332);
	}

}
