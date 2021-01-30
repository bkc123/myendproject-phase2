package com.hcl.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hcl.model.User;

//import javax.security.auth.login.Configuration;

public class HibernateUtil {

	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration().configure();
			configuration.addAnnotatedClass(com.hcl.model.User.class);
			StandardServiceRegistryBuilder builder = 
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

			SessionFactory factory= configuration.buildSessionFactory(builder.build());

			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			//Player p1 = new Player(3, "Ragnar", "USA", 3) ;
			//Player p2 = new Player(1, "Bindas", "USA", 2) ;
			//session.save(p1);
			//session.save(p2);

			//Player p = session.get(Player.class, 1);
			//System.out.println("the Details: " + p);
			//p.setAge(55);
			//p.setPlayername("hjuhuh");
			//session.delete(p);

			User u1 = new User("Binod","Chhantyal", "chha@hcl.com", "bkc", "123", "male", "reading", "USA");	
			session.save(u1);	
			transaction.commit();
			session.close();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}