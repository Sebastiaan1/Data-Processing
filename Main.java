// Sebastiaan Jansen
// Klas V1C

//Opdracht P1


package reiziger;

import reiziger.Reiziger;
import reiziger.ReizigerDAO;
import reiziger.ReizigerDAOimplement;

public class Main {
	   public static void main(String[] args) {
	      ReizigerDAO reizigerdao = new ReizigerDAOimplement();

	      //print all reizigers
	      for (Reiziger reiziger : reizigerdao.findAll()) {
	         System.out.println("Reiziger:"
	         		+ "\n	Naam : " + reiziger.getNaam()
	         		+ "\n	Geboortedatum : " + reiziger.getGbdatum()
	         		+ "\n");
	      }


	      //update reiziger
	      Reiziger reiziger1 = reizigerdao.findAll().get(0);
	      System.out.println(reiziger1.getGbdatum());
	      reizigerdao.update(reiziger1);

	      //get the reiziger
	      for (Reiziger reiziger2 : reizigerdao.findAll()) {
	    	  System.out.println("Reiziger:"
		         		+ "\n	Naam : " + reiziger2.getNaam()
		         		+ "\n	Geboortedatum : " + reiziger2.getGbdatum()
		         		+ "\n");
		      }	
	      
	      //delete reiziger
	      Reiziger reiziger3 = reizigerdao.findAll().get(0);
	      reizigerdao.delete(reiziger3);

	      //get the reiziger
	      for (Reiziger reiziger4 : reizigerdao.findAll()) {
	    	  System.out.println("Reiziger:"
		         		+ "\n	Naam : " + reiziger4.getNaam()
		         		+ "\n	Geboortedatum : " + reiziger4.getGbdatum()
		         		+ "\n");
		      }	
	   }	
}
	