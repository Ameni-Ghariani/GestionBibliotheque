package com.GestionBibliotheque.controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControleurUser 
{
	@RequestMapping(value= "/index")
	@ResponseBody
	public String bonjour(String nom)
	{
		return "<center><h1>JavaEE 2021</h1>"
				+ "<h1>Bonjour Mr/Mme" + nom + "</h1></center>";
	}
	
}
