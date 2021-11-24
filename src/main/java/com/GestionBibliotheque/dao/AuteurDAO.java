package com.GestionBibliotheque.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionBibliotheque.metier.Auteur;

public interface AuteurDAO extends JpaRepository<Auteur, Long>
{
	
}
