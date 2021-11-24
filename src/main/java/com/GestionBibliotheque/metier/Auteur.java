package com.GestionBibliotheque.metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Auteur")
public class Auteur implements Serializable 
{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomPrenom;
	private int nbrePoints=0;
	
	public Auteur() {};
	public Auteur(Long id, String nomPrenom) {
		super();
		this.id = id;
		this.nomPrenom = nomPrenom;
	}
	
	public Auteur(String nomPrenom) {
		super();
		this.nomPrenom = nomPrenom;
	}
	public void addPoints(int p) {
		this.nbrePoints+=p;
	}
	
	@Override
	public String toString() {
		return "Auteur [id=" + id + ", nomPrenom=" + nomPrenom + ", nbrePoints=" + nbrePoints + "]";
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public int getNbrePoints() {
		return nbrePoints;
	}
	public void setNbrePoints(int nbrePoints) {
		this.nbrePoints = nbrePoints;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Auteur other = (Auteur) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
