package domain;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sun.xml.internal.ws.handler.HandlerException;

public class HibernateUtil {
	public static final SessionFactory SESSION_FACTORY;
	
	static {
		Configuration conf = new Configuration().configure();
		SESSION_FACTORY = conf.buildSessionFactory();
	}
	
	public static final ThreadLocal<Session> session = new ThreadLocal<Session>();
	
	public static Session currentSession()throws HandlerException{
		Session s = session.get();
		if (s==null) {
			s = SESSION_FACTORY.openSession();
			session.set(s);
		}
		return s;
	}
	
	public static void closeSession()throws HibernateException{
		Session s = session.get();
		if (s !=null ) {
			s.close();
		}
		session.set(null);
	}
}
