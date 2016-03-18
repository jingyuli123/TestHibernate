package domain;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonManage {
	public static void main(String[] args) {
		Session sess = HibernateUtil.currentSession();
		Transaction tr = sess.beginTransaction();
		
		Person g = new Person();
		g.setName("nish");
		g.setAge(24);
		
		Collection<String> school = new ArrayList<String>();
		school.add("jkjl");
		school.add("jksjd");
		school.add("sdjf");
		
		g.setSchools(school);
		sess.save(g);
		tr.commit();
		HibernateUtil.closeSession();
		
	}
}
