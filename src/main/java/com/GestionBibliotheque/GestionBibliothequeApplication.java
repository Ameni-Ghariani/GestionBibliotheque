package com.GestionBibliotheque;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.GestionBibliotheque.dao.AuteurDAO;
import com.GestionBibliotheque.dao.LivreDAO;
import com.GestionBibliotheque.metier.Auteur;
import com.GestionBibliotheque.metier.Livre;

@SpringBootApplication
public class GestionBibliothequeApplication {

	public static void main(String[] args) {
		ApplicationContext cont = SpringApplication.run(GestionBibliothequeApplication.class, args);
		AuteurDAO auteurdao = cont.getBean(AuteurDAO.class);
		LivreDAO livredao = cont.getBean(LivreDAO.class);
//		Auteur a1 = new Auteur("Khemakhem Aida");
//		Auteur a2 = new Auteur("Gargouri Bilel");
//		Auteur a3 = new Auteur("Gargouri Faiez");
//		Auteur a4 = new Auteur("Bouaziz Rafik");
//		
//		auteurdao.save(a1);
//		auteurdao.save(a2);
//		auteurdao.save(a3);
//		auteurdao.save(a4);
//
//		Livre l1 = new Livre("IB2222", 2015, "LMF-ISO-24613");
//		Livre l2 = new Livre("IB3333", 2009, "UML-Diagramme de Classe");
//		Livre l3 = new Livre("IB5555", 2017, "POO-Avancée");
//		
//		livredao.save(l1);
//		livredao.save(l2);
//		livredao.save(l3);
//
//		l1.addAuteur(a1);
//		l1.addAuteur(a2);
//		l2.addAuteur(a3);
//		l2.addAuteur(a4);
//		l3.addAuteur(a1);
//		l3.addAuteur(a3);
//
//
//		auteurdao.save(a1);
//		auteurdao.save(a2);
//		auteurdao.save(a3);
//		auteurdao.save(a4);
//		
//		livredao.save(l1);
//		livredao.save(l2);
//		livredao.save(l3);
	}

}
