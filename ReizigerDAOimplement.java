package reiziger;
import java.sql.Date;
import java.util.ArrayList;

import reiziger.Reiziger;

public class ReizigerDAOimplement implements ReizigerDAO{
	
   //list is working as a database
	ArrayList<Reiziger> reizigers;
   
   public ReizigerDAOimplement(){
	      reizigers = new ArrayList<Reiziger>();
	      Reiziger reiziger1 = new Reiziger("test",Date.valueOf("1990-12-23"));
	      Reiziger reiziger2 = new Reiziger("test1",Date.valueOf("1990-12-25"));
	      reizigers.add(reiziger1);
	      reizigers.add(reiziger2);		
	   }
	public ArrayList<Reiziger> findAll() {
		return reizigers;
	}

	public ArrayList<Reiziger> findByGBdatum(String GBdatum) {
		ArrayList<Reiziger> reizigers2 = new ArrayList<Reiziger>();
		
	    for (Reiziger reiziger : reizigers) {
	        if (reiziger.getGbdatum().equals(GBdatum.toString())) {
	            reizigers2.add(reiziger);
	        }
	    }
		return reizigers2;
	}

	public Reiziger save(Reiziger reiziger) {
		reizigers.add(reiziger);
		return reiziger;	
	}

	public Reiziger update(Reiziger reiziger) {
	    for (Reiziger reiziger2 : reizigers) {
	        if (reiziger2.getGbdatum().equals(reiziger.getGbdatum().toString())) {
	       	 	reiziger2.setNaam(reiziger.getNaam());
	       	 	reiziger2.setGbdatum(reiziger.getGbdatum());
	        }
	    }
		return reiziger;
	}
	@Override
	public boolean delete(Reiziger reiziger) {
		 reizigers.remove(reiziger);
	     System.out.println("reiziger: GBdatum " + reiziger.getGbdatum() + ", deleted from database \n");
		 return true;
	}

}
