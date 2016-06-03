package fr.formation.SystemeBancaire;

import java.sql.SQLException;

/**
 * class main
 * @version 1.0
 * @author fadul
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       Client client1 = new Client("Oncle", "Picsou", 123);
       double soldelient1 = client1.getSoldeFromDb();
       System.out.println(soldelient1);
    }
}
