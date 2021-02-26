package fr.epsi.moviereview2.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

	@Autowired
	private EntityManager entitymanager;
	
//	public List<Animal> getListeAnimaux() {				
//		
//		return entitymanager.createQuery("SELECT a FROM Animal a ORDER BY a.nom", Animal.class)
//							.getResultList();		
//	}
//	
//	public List<Animal> getAnimalByNom(String animal) {							
//			return  entitymanager.createQuery("SELECT a FROM Animal a WHERE lower(a.nom) LIKE lower('%"+animal+"%')", Animal.class)
//					.getResultList();												
//	}
//	
//	public Animal getAnimal(String id) {							
//		return  entitymanager.createQuery("SELECT a FROM Animal a WHERE a.id = '"+id+"'", Animal.class)
//				.getSingleResult();												
//	}
//
//	private boolean getDoneBy(PopulationSoigneur populationSoigneur)
//	{
//		List<PopulationSoigneur> popSoign = entitymanager.createQuery("SELECT p FROM PopulationSoigneur p WHERE p.animal_id = '"+ populationSoigneur.getAnimalId()+"' and p.soigneur_id = '"+ populationSoigneur.getSoigneurId() +"'", PopulationSoigneur.class)
//				.getResultList();
//		return popSoign.size() > 0 ? true : false;
//	}
//	
//	
//	private int hasAtLeastOneSoign(PopulationSoigneur populationSoigneur)
//	{
//		return entitymanager.createQuery("SELECT p FROM PopulationSoigneur p WHERE p.animal_id = '"+ populationSoigneur.getAnimalId()+"'",PopulationSoigneur.class)
//				.getResultList().size();
//	}
//
//	@Transactional
//	public void setSoigneurForAnimal (PopulationSoigneur populationSoigneur)
//	{
//	
//		if (getDoneBy(populationSoigneur))
//		{
//			if (hasAtLeastOneSoign(populationSoigneur) > 1 )
//				entitymanager.remove(entitymanager.contains(populationSoigneur) ? populationSoigneur : entitymanager.merge(populationSoigneur));
//		} else {
//			entitymanager.persist(populationSoigneur);
//		}
//	}
//	
//	@Transactional
//	public void setAnimal(Animal animal)
//	{
//		if (getAnimalByNom(animal.getNom()).size() == 0)		
//			entitymanager.persist(animal);		
//	}
}

