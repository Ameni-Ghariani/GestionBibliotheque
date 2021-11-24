package com.GestionBibliotheque.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionBibliotheque.metier.Livre;

public interface LivreDAO extends JpaRepository<Livre, String>
{
	public ArrayList<Livre>findByAnnee(int annee);
	public ArrayList<Livre>findByTitre(String titre);
	public ArrayList<Livre>findByIsbn(String isbn);
	@Transactional
	public void deleteByAnnee(int annee);
	
	
}
