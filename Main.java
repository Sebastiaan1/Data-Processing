// Sebastiaan Jansen
// Klas V1C

//Opdracht P2


package reiziger;

import reiziger.Reiziger;
import reiziger.ReizigerDAO;
import reiziger.ReizigerDAOimplement;
import reiziger.OracleBaseDAO;
import java.sql.*;

public class Main {
	   public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		   
	      ReizigerDAO reizigerdao = new ReizigerDAOimplement();

	      //Print alle reizigers.
	      for (Reiziger reiziger : reizigerdao.findAll()) {
	         System.out.println("Reiziger:"
	         		+ "\n	Naam : " + reiziger.getNaam()
	         		+ "\n	Geboortedatum : " + reiziger.getGbdatum()
	         		+ "\n");
	      }


	      //Update de eerste reiziger.
	      Reiziger reiziger1 = reizigerdao.findAll().get(0);
	      System.out.println(reiziger1.getGbdatum());
	      reizigerdao.update(reiziger1);

	      //Print alle reizigers. (na update)
	      for (Reiziger reiziger2 : reizigerdao.findAll()) {
	    	  System.out.println("Reiziger:"
		         		+ "\n	Naam : " + reiziger2.getNaam()
		         		+ "\n	Geboortedatum : " + reiziger2.getGbdatum()
		         		+ "\n");
		      }	
	      
	      //Delete de eerste reiziger.
	      Reiziger reiziger3 = reizigerdao.findAll().get(0);
	      reizigerdao.delete(reiziger3);

	      //Print alle reizigers. (na delete)
	      for (Reiziger reiziger4 : reizigerdao.findAll()) {
	    	  System.out.println("Reiziger:"
		         		+ "\n	Naam : " + reiziger4.getNaam()
		         		+ "\n	Geboortedatum : " + reiziger4.getGbdatum()
		         		+ "\n");
		      }
	      
	      System.out.println("-----------------------------------------");
	      System.out.println("-----------------------------------------");
	      System.out.println("-----------------------------------------");
	      
	      //Instantieer een nieuwe OracleBase.
		  OracleBaseDAO base = new OracleBaseDAO();
		  //Maak een connectie met de database.
	      Connection conn = base.getConnection();
	      //Laat alle OV kaarten zien.
	      base.showAllOV(conn);
	      //Sluit de connectie.
	      base.closeConnection(conn);
	   }	
}
	