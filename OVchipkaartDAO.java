package dao_implementatie;

import java.util.ArrayList;

public interface OVchipkaartDAO {
	   public ArrayList<OVchipkaart> findAll();
	   public ArrayList<OVchipkaart> findByKaartnummer(int kaartnummer);
	   public OVchipkaart save(OVchipkaart ovCchipkaart);
	   public OVchipkaart update(OVchipkaart ovChipkaart);
	   public boolean delete(OVchipkaart ovChipkaart);
}

