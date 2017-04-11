package com.cesar20991.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cesar20991.dao.IPersonaDAO;
import com.cesar20991.model.Persona;

@Named
@RequestScoped
public class PersonaDAOImpl implements IPersonaDAO, Serializable {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonalPU");
	EntityManager em = emf.createEntityManager();

	@Override
	public void registrar(Persona per) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(per);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}finally{
			em.close();
			emf.close();
		}
		// System.out.println("registrando...");
	}

	@Override
	public void modificar(Persona per) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Persona> listar() throws Exception {
		List<Persona> lista = null;
		
		try{
			Query query = em.createQuery("FROM Persona p");
			lista = (List<Persona>)query.getResultList();			
		}catch(Exception e){
			throw e;
		}finally{
			em.close();
			emf.close();			
		}
		return lista;
	}

}
