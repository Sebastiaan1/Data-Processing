package dao_implementatie;

import java.sql.Date;

public class Reiziger {
	private String naam;
	private Date gbDatum;
	
	public Reiziger(String naam, Date gbDatum){
		this.gbDatum = gbDatum;
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public Date getGbdatum() {
		return gbDatum;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setGbdatum(Date gbdatum) {
		this.gbDatum = gbdatum;
	}


	

}

