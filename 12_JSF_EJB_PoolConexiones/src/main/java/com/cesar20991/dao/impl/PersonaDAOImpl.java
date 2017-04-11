package com.cesar20991.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cesar20991.dao.IPersonaDAO;
import com.cesar20991.model.Persona;

//@Named
//@RequestScoped
@Stateless
public class PersonaDAOImpl implements IPersonaDAO, Serializable {

	
	@PersistenceContext(unitName = "PersonalPU")
	private EntityManager em;
	
	@PersistenceContext(unitName = "PersonalMySQLPU")
	private EntityManager em2;
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonalPU");
	//EntityManager em = emf.createEntityManager();

	@Override
	public void registrar(Persona per) throws Exception {
		try {
			//em.getTransaction().begin();
			em.persist(per);
			//em.getTransaction().commit();
		} catch (Exception e) {
			/*if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}*/
		}finally{
			//em.close();
			//emf.close();
		}
		// System.out.println("registrando...");
	}
	
	@Override
	public void registrarMySQL(Persona per) throws Exception{
		em2.persist(per);
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
			//em.close();
			//emf.close();			
		}
		return lista;
	}

}
