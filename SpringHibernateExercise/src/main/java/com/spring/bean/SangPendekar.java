package com.spring.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SANG_PENDEKAR")
public class SangPendekar {
	
	@Id
	@Column(name="ID_PENDEKER", unique=true, nullable=false)
	private String idPendekar;
	
	@Column(name="NAMA_PENDEKAR")
	private String namaPendekar;
	
	@Column(name="PERGURUAN")
	private String perguruan;

	public SangPendekar() {
		// TODO Auto-generated constructor stub
	}
	
	public String getIdPendekar() {
		return idPendekar;
	}

	public void setIdPendekar(String idPendekar) {
		this.idPendekar = idPendekar;
	}

	public String getNamaPendekar() {
		return namaPendekar;
	}

	public void setNamaPendekar(String namaPendekar) {
		this.namaPendekar = namaPendekar;
	}

	public String getPerguruan() {
		return perguruan;
	}

	public void setPerguruan(String perguruan) {
		this.perguruan = perguruan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPendekar == null) ? 0 : idPendekar.hashCode());
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
		SangPendekar other = (SangPendekar) obj;
		if (idPendekar == null) {
			if (other.idPendekar != null)
				return false;
		} else if (!idPendekar.equals(other.idPendekar))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SangPendekar [idPendekar=" + idPendekar + "]";
	}
	
	
	
}
