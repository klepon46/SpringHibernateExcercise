package com.spring.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SENJATA_PENDEKAR")
public class SenjataPendekar implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_SENJATA", unique=true, nullable =false, length=6)
	private String idSenjata;
	
	@Column(name="NAMA_SENJATA", unique=true, length=20)
	private String namaSenjata;
	
	@Column(name="ELEMEN_SENJATA", length=10)
	private String elemenSenjata;

	public SenjataPendekar() {
		// TODO Auto-generated constructor stub
	}
	
	public String getIdSenjata() {
		return idSenjata;
	}

	public void setIdSenjata(String idSenjata) {
		this.idSenjata = idSenjata;
	}

	public String getNamaSenjata() {
		return namaSenjata;
	}

	public void setNamaSenjata(String namaSenjata) {
		this.namaSenjata = namaSenjata;
	}

	public String getElemenSenjata() {
		return elemenSenjata;
	}

	public void setElemenSenjata(String elemenSenjata) {
		this.elemenSenjata = elemenSenjata;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idSenjata == null) ? 0 : idSenjata.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SenjataPendekar other = (SenjataPendekar) obj;
		if (idSenjata == null) {
			if (other.idSenjata != null)
				return false;
		} else if (!idSenjata.equals(other.idSenjata))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SenjataPendekar [idSenjata=" + idSenjata + "]";
	}
	
	
}
