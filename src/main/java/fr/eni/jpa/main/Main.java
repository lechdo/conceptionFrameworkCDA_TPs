package fr.eni.jpa.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.jpa.bo.Region;
import fr.eni.jpa.service.GestionRegion;

public class Main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		GestionRegion gc = context.getBean("gestionRegion", GestionRegion.class);
		
		System.out.println("Regions :");
		for (Region region : gc.lister()) {
			System.out.println(region);
		}
		
		
		
	}

}
