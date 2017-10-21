package com.devhealth.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.devhealth.entity.ProcedimentoTeste;

public class TesteDAO {
	
	public void teste() {
		
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("mydb");
		
		EntityManager em = factory.createEntityManager();
		
		ProcedimentoTeste proc = new ProcedimentoTeste();
		
		proc.setDs_procedimento("Teste de procedimento");
		em.getTransaction().begin();
		em.persist(proc);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}
	
}
