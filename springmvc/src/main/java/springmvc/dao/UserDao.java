package springmvc.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {

	
@Autowired	
private HibernateTemplate hibenateTamplate ;
@Transactional
public int saveUser (User user) {
	
	int id  = (int) this.hibenateTamplate.save(user);
	return id;
}



}
