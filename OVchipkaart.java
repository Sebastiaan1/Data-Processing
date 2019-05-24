package dao_implementatie;

import java.sql.Date;

public class OVchipkaart {
	private int kaartNummer;
	private Date geldigTot;
	private int klasse;
	private double saldo;
	private Date gbDatum;
	
	public OVchipkaart(int kaartNummer, Date geldigTot, int klasse, double saldo, Reiziger reiziger){
		this.kaartNummer = kaartNummer;
		this.geldigTot = geldigTot;
		this.klasse = klasse;
		this.saldo = saldo;
		this.gbDatum = reiziger.getGbdatum();
	}

	public int getKaartNummer() {
		return kaartNummer;
	}

	public Date getGeldigTot() {
		return geldigTot;
	}

	public int getKlasse() {
		return klasse;
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getGbDatum() {
		return gbDatum;
	}

	public void setKaartNummer(int kaartNummer) {
		this.kaartNummer = kaartNummer;
	}

	public void setGeldigTot(Date geldigTot) {
		this.geldigTot = geldigTot;
	}

	public void setKlasse(int klasse) {
		this.klasse = klasse;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setGbDatum(Date gbDatum) {
		this.gbDatum = gbDatum;
	}

}

