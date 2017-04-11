package com.cesar20991.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cesar20991.dao.IPersonaDAO;
import com.cesar20991.model.Persona;
import com.cesar20991.model.Telefono;

//@Named
//@RequestScoped
@Stateless
public class PersonaDAOImpl implements IPersonaDAO, Serializable {

	
	@PersistenceContext(unitName = "PersonalPU")
	private EntityManager em;
	
	//@PersistenceContext(unitName = "PersonalMySQLPU")
	//private EntityManager em2;
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
	public void modificar(Persona per) throws Exception {
		em.merge(per);
		System.out.println(" MODIFICASTE AL USUARIO: " + per.getNombres());
		if(per.getFoto() != null && per.getFoto().length > 0){
			System.out.println("MODIFICASTE LA IMAGEN A " + per.getFoto());
			Query query = em.createQuery("UPDATE Persona SET foto = ?1 WHERE idPersona = ?2");
			query.setParameter(1, per.getFoto());
			query.setParameter(2, per.getIdPersona());
			query.executeUpdate();
		}
	}

	@Override
	public List<Persona> listar() throws Exception {
		List<Persona> lista = new ArrayList<Persona>();
		
		try{
			Query query = em.createQuery("SELECT p FROM Persona p ORDER BY p.nombres");
			lista = (List<Persona>)query.getResultList();			
		}catch(Exception e){
			throw e;
		}finally{
			//em.close();
			//emf.close();			
		}
		return lista;
	}

	@Override
	public Persona listarPorId(Persona persona) throws Exception {
		Persona per = new Persona();
		List<Persona> lista = new ArrayList<>();
		try{
			//em.find(Persona.class, persona);			
			Query query = em.createQuery("SELECT p FROM Persona p where p.idPersona = ?1");
			query.setParameter(1, persona.getIdPersona());
			
			lista = (List<Persona>) query.getResultList();
			
			if(lista != null && !lista.isEmpty()){
				per = lista.get(0);
			}
		}catch(Exception e){
			throw e;
		}			
		return per;
	}

	@Override
	public void listarWS() {
		// TODO Auto-generated method stub		
	}

	@Override
	public List<Telefono> getTelefonosXPersona(Persona per) {		
		List<Telefono> lista = new ArrayList<>();
		try{
			Query query = em.createQuery("SELECT t FROM Telefono t JOIN t.persona p where p.idPersona = ?1");
			query.setParameter(1, per.getIdPersona());			
			lista = (List<Telefono>) query.getResultList();			
		}catch(Exception e){
			throw e;
		}			
		return lista;
	}

}
