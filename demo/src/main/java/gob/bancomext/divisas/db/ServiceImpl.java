package gob.bancomext.divisas.db;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceImpl {

	private DAO dao;
	
	@Autowired(required = true)
	@Resource(name="dao")
	public void setDao(DAO dao){
		this.dao = dao;
	}
	
	@Transactional
	public <T> T get(Class<T> myClass, int id){
		return dao.get(myClass, id);
	}

	@Transactional
	public int getLastInsertId(String model) {
		return dao.getLastInsertId(model);
	}
	
	@Transactional
	public<T> int save(T model){
		return dao.save(model);
	}
	
	@Transactional
	public<T> void update(T model){
		dao.update(model);
	}
	
	@Transactional
	public<T> void delete(T model){
		dao.delete(model);
	}
	
	@Transactional
	public<T> List<T> getAll(Class<T> myClass){
		return dao.getAll(myClass);
	}
}
