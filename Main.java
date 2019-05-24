// Sebastiaan Jansen
// Klas V1C

//Opdracht P2


package dao_implementatie;

import java.sql.*;

import dao_implementatie.OracleBaseDAO;
import dao_implementatie.Reiziger;
import dao_implementatie.ReizigerDAO;
import dao_implementatie.ReizigerDAOimplement;

public class Main {
	   public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		  
		  //Hier is het gedeelte met reizigers.
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
				      
				      
		  //Hier is het gedeelte met OV-chipkaarten.
		   			  OVchipkaartDAO ovchipkaartdao = new OVchipkaartDAOimplement();

				      //Print alle OV-chipkaarten.
				      for (OVchipkaart ovchipkaart : ovchipkaartdao.findAll()) {
				         System.out.println("OV-chipkaart:"
				         		+ "\n	Nummer : " + ovchipkaart.getKaartNummer()
				         		+ "\n	Reiziger : " + ovchipkaart.getGbDatum()
				         		+ "\n	Saldo : " + ovchipkaart.getSaldo()
				         		+ "\n	Verloopt op : " + ovchipkaart.getGeldigTot()
				         		+ "\n	Klasse : " + ovchipkaart.getKlasse()
				         		+ "\n");
				      }
			
			
				      //Update de eerste OV-chipkaart.
				      OVchipkaart ovchipkaart1 = ovchipkaartdao.findAll().get(0);
				      ovchipkaartdao.update(ovchipkaart1);
			
				      //Print alle OV-chipkaarten. (na update)
				      for (OVchipkaart ovchipkaart2 : ovchipkaartdao.findAll()) {
				         System.out.println("OV-chipkaart:"
					         		+ "\n	Nummer : " + ovchipkaart2.getKaartNummer()
					         		+ "\n	Reiziger : " + ovchipkaart2.getGbDatum()
					         		+ "\n	Saldo : " + ovchipkaart2.getSaldo()
					         		+ "\n	Verloopt op : " + ovchipkaart2.getGeldigTot()
					         		+ "\n	Klasse : " + ovchipkaart2.getKlasse()
					         		+ "\n");
					      }
				      
				      //Delete de eerste OV-chipkaart.
				      OVchipkaart ovchipkaart3 = ovchipkaartdao.findAll().get(0);
				      ovchipkaartdao.delete(ovchipkaart3);
			
				      //Print alle OV-chipkaarten. (na delete)
				      for (OVchipkaart ovchipkaart4 : ovchipkaartdao.findAll()) {
				         System.out.println("OV-chipkaart:"
					         		+ "\n	Nummer : " + ovchipkaart4.getKaartNummer()
					         		+ "\n	Reiziger : " + ovchipkaart4.getGbDatum()
					         		+ "\n	Saldo : " + ovchipkaart4.getSaldo()
					         		+ "\n	Verloopt op : " + ovchipkaart4.getGeldigTot()
					         		+ "\n	Klasse : " + ovchipkaart4.getKlasse()
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
	