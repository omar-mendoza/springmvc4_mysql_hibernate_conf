package gob.bancomext.divisas.db;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {

	//@Autowired(required=true)
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	public DAO(){
		
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public <T> T get(Class<T> myClass, int id){
		return (T)sessionFactory.getCurrentSession().get(myClass,id);
	}
	
	public Integer getLastInsertId(String model) {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT LAST_INSERT_ID()";
		return (Integer) session.createQuery(query).uniqueResult();
		
	}
	
	public <T> int save(T model){
		Session session = sessionFactory.getCurrentSession();
		return (Integer) session.save(model);
	}
	
	public <T> void update(T model){
		sessionFactory.getCurrentSession().update(model);
	}
	
	public <T> void delete(T model){
		sessionFactory.getCurrentSession().delete(model);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> getAll(Class<T> myClass){
		Session session = sessionFactory.getCurrentSession();
		Disjunction disjunction = Restrictions.disjunction();
		return session.createCriteria(myClass).add(disjunction).list();
//		return session.createCriteria(myClass).list();
	}
	
	

}
