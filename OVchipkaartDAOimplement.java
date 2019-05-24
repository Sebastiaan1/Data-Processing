package dao_implementatie;
import java.sql.Date;
import java.util.ArrayList;

public class OVchipkaartDAOimplement implements OVchipkaartDAO{
	
   //list is working as a database
	ArrayList<OVchipkaart> kaarten;
	ReizigerDAO reizigerdao = new ReizigerDAOimplement();
   
   public OVchipkaartDAOimplement(){
	      kaarten = new ArrayList<OVchipkaart>();

	      OVchipkaart ovChipkaart1 = new OVchipkaart(1, Date.valueOf("1990-01-02"), 2, 20.00, reizigerdao.findAll().get(0));
	      kaarten.add(ovChipkaart1);		
	   }
	public ArrayList<OVchipkaart> findAll() {
		return kaarten;
	}

	public ArrayList<OVchipkaart> findByKaartnummer(int kaartnummer) {
		ArrayList<OVchipkaart> kaarten2 = new ArrayList<OVchipkaart>();
		
	    for (OVchipkaart ovChipkaart : kaarten) {
	        if (ovChipkaart.getKaartNummer() == (kaartnummer)) {
	            kaarten2.add(ovChipkaart);
	        }
	    }
		return kaarten2;
	}

	public OVchipkaart save(OVchipkaart ovChipkaart) {
		kaarten.add(ovChipkaart);
		return ovChipkaart;	
	}

	public OVchipkaart update(OVchipkaart ovChipkaart) {
	    for (OVchipkaart ovChipkaart2 : kaarten) {
	        if (ovChipkaart2.getKaartNummer() == (ovChipkaart.getKaartNummer())) {
	       	 	ovChipkaart2.setGbDatum(ovChipkaart.getGbDatum());
	       	 	ovChipkaart2.setGeldigTot(ovChipkaart.getGeldigTot());
	       	 	ovChipkaart2.setKaartNummer(ovChipkaart.getKaartNummer());
	       	 	ovChipkaart2.setKlasse(ovChipkaart.getKlasse());
	       	 	ovChipkaart2.setSaldo(ovChipkaart.getSaldo());
	        }
	    }
		return ovChipkaart;
	}
	@Override
	public boolean delete(OVchipkaart ovChipkaart) {
		 kaarten.remove(ovChipkaart);
	     System.out.println("ovChipkaart: Kaartnummer " + ovChipkaart.getKaartNummer() + ", deleted from database \n");
		 return true;
	}

}
