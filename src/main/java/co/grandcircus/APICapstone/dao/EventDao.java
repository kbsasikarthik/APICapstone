package co.grandcircus.APICapstone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.APICapstone.entity.BucketList;
import co.grandcircus.APICapstone.entity.Event;

@Repository

@Transactional
public class EventDao {

	@PersistenceContext
	private EntityManager em;

	public List<BucketList> findAll() {
		return em.createQuery("FROM BucketList", BucketList.class).getResultList();
	}

	// unused method
	public Event findByName(String name) {
		return em.find(Event.class, name);
	}

	public void delete(Long id) {
		Event event = em.getReference(Event.class, id);
		em.remove(event);
	}

	public void update(BucketList bl) {
		em.merge(bl);
	}

}
