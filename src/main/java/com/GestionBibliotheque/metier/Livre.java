package com.GestionBibliotheque.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Livre")
public class Livre implements Serializable {
	@Id
	private String isbn;

	private int annee;
	private String titre;
	@ManyToMany (fetch = FetchType.EAGER)
	private Collection<Auteur> auteurs;

	public Livre() {}
	
	public Livre(String isbn, int annee,String titre) {
		this.isbn = isbn;
		this.annee = annee;
		this.titre = titre;
		this.auteurs=new ArrayList<Auteur>();
	}

	public boolean addAuteur(Auteur a) {
		if (a != null && auteurs.contains(a) == false) 
		{
			auteurs.add(a);
			a.addPoints(3);
			return true;

		}

		return false;

	}

	@Override
	public String toString() {
		return "Livre [isbn=" + isbn + ", annee=" + annee + ", titre=" + titre + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Collection<Auteur> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(Collection<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Livre other = (Livre) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
