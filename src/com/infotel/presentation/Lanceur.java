package com.infotel.presentation;

import java.util.List;

import com.infotel.metier.Adresse;
import com.infotel.metier.Connexion;
import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

	/**  Le docstring
	 *  de la classe Lanceur
	 *  de le perrouquet
	 *  @author LA MOA
	 */

public class Lanceur {

	/**  Commentaire de la methode main 
	 *  @param args
	 */
	
	public static void main(String[] args) {
		Iservice service = new ServiceImpl();
		Personne p = new Personne();
//		Employe e = new Employe();
//		Client c = new Client();
		Adresse a = new Adresse();
		Connexion c = new Connexion();

//		p.setNom("Arbuckle");
//		p.setPrenom("John");
//		p.setAge(41);
//		service.ajouterPersonne(p);
//
//		e.setNom("Cena");
//		e.setPrenom("John");
//		e.setAge(55);
//		e.setSalaire(60);
//		service.ajouterPersonne(e);
//		
//		c.setNom("D'oeuf");
//		c.setPrenom("John");
//		c.setAge(81);
//		c.setNumeroAdherent((int)Math.pow(2,Math.pow(2,5)-1)-1);
//		service.ajouterPersonne(c);
		
//		System.out.println(service.findPersonne(3));
//		service.supprimerPersonne(service.getPersonne(2));

		// pour modifier, need detacher donc em.find()
		// pour supprimer, need attaché donc em.getReference()
//		int leid = 4;
//		p = service.findPersonne(leid);
//		System.out.println("avant :");
//		System.out.println(p);
//		p = service.findPersonne(leid);
//		p.setAge(999);
//		service.modifierPersonne(p);
//		p = service.findPersonne(leid);
//		System.out.println("apres :");
//		System.out.println(p);
		
//		List<Personne> list = service.findAllPeople();
//		for (Personne pl : list) {
//			System.out.println(pl);
//		}
		
//		List<Personne> list = service.searchPeopleFromKW("A");
//		for (Personne pl : list) {
//			System.out.println(pl);
//		}

//		a.setNumRue("0");
//		a.setNomRue("jniop");
//		a.setCp("00000");
//		a.setVille("Ici");
//		service.ajouterAdresse(a);
		
//		c.setLogin("Spartacus3 ");
//		c.setMdp("Caesar3");
//		service.ajouterConnexion(c);
		
//		List<Adresse> list = service.findAllAddresses();
//		for (Adresse ad : list) {
//			System.out.println(ad);
//		}

//		String var = "SUI";
//		List<Adresse> list1 = service.searchAddressesFromKW(var);
//		System.out.println("villes contenant " + var);
//		for (Adresse ad : list1) {
//			System.out.println(ad);
//		}

//		// ne supporte par un field dynamique, need ecrit en dur dans le select
//		String field = "nomRue";
//		var = "bd";
//		List<Adresse> list2 = service.searchAddressesFromKW2(field, var);
//		System.out.println("" + field + " contenant " + var);
//		for (Adresse ad : list2) {
//			System.out.println(ad);
//		}
		
//		service.supprimerConnexion(service.getConnexion(9));
//		service.supprimerAdresse(service.getAdresse(6));
		
//		Connexion c1 = service.findConnexion(8);
//		System.out.println("avant");
//		System.out.println(c1);
//		c1.setLogin("alfred");
//		c1.setMdp("demousseux");
//		service.modifierConnexion(c1);
//		Connexion c2 = service.findConnexion(8);
//		System.out.println("apres");
//		System.out.println(c2);
		
//		Adresse a1 = new Adresse();
//		a1.setCp("78978");
//		a1.setVille("Vias");
//		a1.setNomRue("");
//		a1.setNumRue("0");
//		Personne p1 = new Personne();
//		p1.setAge(302);
//		p1.setNom("Asic3");
//		p1.setPrenom("Louis3");
//		p1.setAdresse(a1);
//		service.ajouterPersonne(p1);
		
		Personne p10 = service.findPersonne(3);
		p10.setAdresse(service.getAdresse(2));
		service.modifierPersonne(p10);
		
//		service.supprimerAdresse(service.getAdresse(8));

//		List<Personne> list2 = service.findAllPersonnesConnexion();
//		for (Personne pl : list2) {
//			System.out.print(pl + ":\t" + pl.getConnexion().getLogin() + ":\t" + pl.getConnexion().getMdp());
//		}

//		for (Personne pers : service.findAllPersonnesAdresse()) {
//			System.out.println(pers + ":\t" + pers.getAdresse());
//		}
	
	}

	
}
