package com.GestionBibliotheque.controleur;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GestionBibliotheque.dao.AuteurDAO;
import com.GestionBibliotheque.metier.Auteur;

@Controller
@RequestMapping(value= "auteur")
public class ControleurAuteur 
{
	@Autowired
	AuteurDAO auteurDAO;
	
	@RequestMapping(value= "/menu")
	public String menuAuteur()
	{
		return "menu";
	}
	
	@RequestMapping(value= "/gerer")
	public String gererAuteur(ModelMap modelMap)
	{
		modelMap.addAttribute("auteurs", auteurDAO.findAll());
		return "gestionAuteurs";
	}
	
	
	@RequestMapping(value= "/add", method=RequestMethod.GET)
	public void addAuteur(ModelMap modelMap, Auteur auteur, HttpServletResponse response)
	{
		auteurDAO.save(auteur);
		modelMap.addAttribute("auteurs", auteurDAO.findAll());
		try {
			response.sendRedirect("gerer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
